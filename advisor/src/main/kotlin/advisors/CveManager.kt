package org.ossreviewtoolkit.advisor.advisors

import java.io.IOException
import java.net.URI
import java.time.Instant

import org.ossreviewtoolkit.advisor.AbstractAdviceProviderFactory
import org.ossreviewtoolkit.advisor.AdviceProvider
import org.ossreviewtoolkit.clients.cvemanager.CveManagerService
import org.ossreviewtoolkit.model.AdvisorCapability
import org.ossreviewtoolkit.model.AdvisorDetails
import org.ossreviewtoolkit.model.AdvisorResult
import org.ossreviewtoolkit.model.AdvisorSummary
import org.ossreviewtoolkit.model.Package
import org.ossreviewtoolkit.model.Vulnerability
import org.ossreviewtoolkit.model.VulnerabilityReference
import org.ossreviewtoolkit.model.config.AdvisorConfiguration
import org.ossreviewtoolkit.model.utils.toPurl
import org.ossreviewtoolkit.utils.common.enumSetOf
import org.ossreviewtoolkit.utils.ort.OkHttpClientHelper
import org.ossreviewtoolkit.utils.ort.log

import retrofit2.HttpException

/**
 * The number of packages to request from Sonatype OSS Index in one request.
 */
private const val BULK_REQUEST_SIZE = 128

/**
 * A wrapper for [Cve Manager](http://sbom.test.osinfra.cn) security vulnerability data.
 */
class CveManager(name: String, serverUrl: String = CveManagerService.DEFAULT_BASE_URL) : AdviceProvider(name) {
    class Factory : AbstractAdviceProviderFactory<CveManager>("CveManager") {
        override fun create(config: AdvisorConfiguration) = CveManager(providerName)
    }

    override val details = AdvisorDetails(providerName, enumSetOf(AdvisorCapability.VULNERABILITIES))

    private val service by lazy {
        CveManagerService.create(
            url = serverUrl,
            client = OkHttpClientHelper.buildClient()
        )
    }

    override suspend fun retrievePackageFindings(packages: List<Package>): Map<Package, List<AdvisorResult>> {
        val startTime = Instant.now()

        val components = packages.map { it.purl }

        return try {
            val componentVulnerabilities = mutableMapOf<String, MutableList<CveManagerService.Vulnerability>>()

            components.chunked(BULK_REQUEST_SIZE).forEach { chunk ->
                val requestResult = getComponentReport(service, chunk)
                requestResult.data.forEach {
                    when {
                        componentVulnerabilities[it.purl] == null -> componentVulnerabilities[it.purl] = mutableListOf(it)
                        else -> componentVulnerabilities[it.purl]?.add(it)
                    }
                }
            }

            val endTime = Instant.now()

            packages.mapNotNullTo(mutableListOf()) { pkg ->
                componentVulnerabilities[pkg.id.toPurl()]?.let { vulnerabilities ->
                    pkg to listOf(
                        AdvisorResult(
                            details,
                            AdvisorSummary(startTime, endTime),
                            vulnerabilities = vulnerabilities.map { it.toVulnerability() }
                        )
                    )
                }
            }.toMap()
        } catch (e: IOException) {
            createFailedResults(startTime, packages, e)
        }
    }

    /**
     * Construct an [ORT Vulnerability][Vulnerability] from an [CveManagerService Vulnerability]
     * [CveManagerService.Vulnerability].
     */
    private fun CveManagerService.Vulnerability.toVulnerability(): Vulnerability {
        val reference = VulnerabilityReference(
            url = URI(cveUrl),
            scoringSystem = when {
                !cvss3Vector.isNullOrEmpty() -> cvss3Vector?.substringBefore('/')
                !cvss2Vector.isNullOrEmpty() -> "CVSS:2.0"
                else -> null
            },
            severity = when {
                !cvss3Vector.isNullOrEmpty() -> cvss3Score.toString()
                !cvss2Vector.isNullOrEmpty() -> cvss2Score.toString()
                else -> null
            }
        )

        val references = mutableListOf(reference)
        return Vulnerability(cveNum, references)
    }

    /**
     * Invoke the [Cve Manager service][service] to request detail information for the given [coordinates]. Catch HTTP
     * exceptions thrown by the service and re-throw them as [IOException].
     */
    private suspend fun getComponentReport(
        service: CveManagerService,
        coordinates: List<String>
    ): CveManagerService.ComponentReport =
        try {
            log.debug { "Querying component report from ${CveManagerService.DEFAULT_BASE_URL}." }
            service.getComponentReport(CveManagerService.ComponentReportRequest(coordinates))
        } catch (e: HttpException) {
            throw IOException(e)
        }
}
