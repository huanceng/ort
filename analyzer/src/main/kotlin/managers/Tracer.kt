package org.ossreviewtoolkit.analyzer.managers

import org.ossreviewtoolkit.analyzer.AbstractPackageManagerFactory
import org.ossreviewtoolkit.analyzer.PackageManager
import org.ossreviewtoolkit.analyzer.PackageManagerResult
import org.ossreviewtoolkit.model.DependencyGraph
import org.ossreviewtoolkit.model.OrtResult
import org.ossreviewtoolkit.model.Package
import org.ossreviewtoolkit.model.ProjectAnalyzerResult
import org.ossreviewtoolkit.model.config.AnalyzerConfiguration
import org.ossreviewtoolkit.model.config.RepositoryConfiguration
import org.ossreviewtoolkit.model.readValue
import org.ossreviewtoolkit.utils.ort.DeclaredLicenseProcessor
import java.io.File

class Tracer(
    name: String,
    analysisRoot: File,
    analyzerConfig: AnalyzerConfiguration,
    repoConfig: RepositoryConfiguration
) : PackageManager(name, analysisRoot, analyzerConfig, repoConfig) {
    class Factory : AbstractPackageManagerFactory<Tracer>("Tracer") {
        override val globsForDefinitionFiles = listOf("trace_result.json")

        override fun create(
            analysisRoot: File,
            analyzerConfig: AnalyzerConfiguration,
            repoConfig: RepositoryConfiguration
        ) = Tracer(managerName, analysisRoot, analyzerConfig, repoConfig)
    }

    private var depGraph: DependencyGraph? = null

    override fun resolveDependencies(definitionFile: File, labels: Map<String, String>): List<ProjectAnalyzerResult> {
        val ortResult = definitionFile.readValue<OrtResult>()
        val packages = sortedSetOf<Package>()

        depGraph = ortResult.analyzer?.result?.dependencyGraphs?.get("Tracer") ?: DependencyGraph()
        ortResult.getPackages().forEach {
            packages.add(it.pkg.copy(declaredLicensesProcessed = DeclaredLicenseProcessor.process(it.pkg.declaredLicenses)))
        }
        val project = ortResult.getProjects().single()
        return listOf(ProjectAnalyzerResult(project, packages))
    }

    override fun createPackageManagerResult(projectResults: Map<File, List<ProjectAnalyzerResult>>) =
        PackageManagerResult(projectResults, depGraph)
}
