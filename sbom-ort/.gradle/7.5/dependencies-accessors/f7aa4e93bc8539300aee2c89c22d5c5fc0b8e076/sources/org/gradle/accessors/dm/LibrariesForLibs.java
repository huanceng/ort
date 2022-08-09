package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `libs` extension.
*/
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(providers, config);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers) {
        super(config, providers);
    }

        /**
         * Creates a dependency provider for antlr (org.antlr:antlr4)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAntlr() { return create("antlr"); }

        /**
         * Creates a dependency provider for asciidoctorj (org.asciidoctor:asciidoctorj)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAsciidoctorj() { return create("asciidoctorj"); }

        /**
         * Creates a dependency provider for asciidoctorjPdf (org.asciidoctor:asciidoctorj-pdf)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAsciidoctorjPdf() { return create("asciidoctorjPdf"); }

        /**
         * Creates a dependency provider for clikt (com.github.ajalt.clikt:clikt)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getClikt() { return create("clikt"); }

        /**
         * Creates a dependency provider for commonsCompress (org.apache.commons:commons-compress)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCommonsCompress() { return create("commonsCompress"); }

        /**
         * Creates a dependency provider for commonsEmail (org.apache.commons:commons-email)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCommonsEmail() { return create("commonsEmail"); }

        /**
         * Creates a dependency provider for config4k (io.github.config4k:config4k)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getConfig4k() { return create("config4k"); }

        /**
         * Creates a dependency provider for cvssCalculator (us.springett:cvss-calculator)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCvssCalculator() { return create("cvssCalculator"); }

        /**
         * Creates a dependency provider for cyclonedx (org.cyclonedx:cyclonedx-core-java)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCyclonedx() { return create("cyclonedx"); }

        /**
         * Creates a dependency provider for detektApi (io.gitlab.arturbosch.detekt:detekt-api)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDetektApi() { return create("detektApi"); }

        /**
         * Creates a dependency provider for digraphParser (com.paypal.digraph:digraph-parser)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDigraphParser() { return create("digraphParser"); }

        /**
         * Creates a dependency provider for diskLruCache (com.jakewharton:disklrucache)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDiskLruCache() { return create("diskLruCache"); }

        /**
         * Creates a dependency provider for exposedCore (org.jetbrains.exposed:exposed-core)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getExposedCore() { return create("exposedCore"); }

        /**
         * Creates a dependency provider for exposedDao (org.jetbrains.exposed:exposed-dao)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getExposedDao() { return create("exposedDao"); }

        /**
         * Creates a dependency provider for exposedJavaTime (org.jetbrains.exposed:exposed-java-time)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getExposedJavaTime() { return create("exposedJavaTime"); }

        /**
         * Creates a dependency provider for exposedJdbc (org.jetbrains.exposed:exposed-jdbc)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getExposedJdbc() { return create("exposedJdbc"); }

        /**
         * Creates a dependency provider for flexmark (com.vladsch.flexmark:flexmark)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getFlexmark() { return create("flexmark"); }

        /**
         * Creates a dependency provider for freemarker (org.freemarker:freemarker)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getFreemarker() { return create("freemarker"); }

        /**
         * Creates a dependency provider for graphQlKtorClient (com.expediagroup:graphql-kotlin-ktor-client)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getGraphQlKtorClient() { return create("graphQlKtorClient"); }

        /**
         * Creates a dependency provider for greenmail (com.icegreen:greenmail)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getGreenmail() { return create("greenmail"); }

        /**
         * Creates a dependency provider for hikari (com.zaxxer:HikariCP)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getHikari() { return create("hikari"); }

        /**
         * Creates a dependency provider for hopliteCore (com.sksamuel.hoplite:hoplite-core)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getHopliteCore() { return create("hopliteCore"); }

        /**
         * Creates a dependency provider for hopliteHocon (com.sksamuel.hoplite:hoplite-hocon)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getHopliteHocon() { return create("hopliteHocon"); }

        /**
         * Creates a dependency provider for jacksonDatabind (com.fasterxml.jackson.core:jackson-databind)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJacksonDatabind() { return create("jacksonDatabind"); }

        /**
         * Creates a dependency provider for jacksonDataformatXml (com.fasterxml.jackson.dataformat:jackson-dataformat-xml)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJacksonDataformatXml() { return create("jacksonDataformatXml"); }

        /**
         * Creates a dependency provider for jacksonDataformatYaml (com.fasterxml.jackson.dataformat:jackson-dataformat-yaml)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJacksonDataformatYaml() { return create("jacksonDataformatYaml"); }

        /**
         * Creates a dependency provider for jacksonDatatypeJsr310 (com.fasterxml.jackson.datatype:jackson-datatype-jsr310)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJacksonDatatypeJsr310() { return create("jacksonDatatypeJsr310"); }

        /**
         * Creates a dependency provider for jacksonModuleJaxbAnnotations (com.fasterxml.jackson.module:jackson-module-jaxb-annotations)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJacksonModuleJaxbAnnotations() { return create("jacksonModuleJaxbAnnotations"); }

        /**
         * Creates a dependency provider for jacksonModuleKotlin (com.fasterxml.jackson.module:jackson-module-kotlin)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJacksonModuleKotlin() { return create("jacksonModuleKotlin"); }

        /**
         * Creates a dependency provider for jgit (org.eclipse.jgit:org.eclipse.jgit)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJgit() { return create("jgit"); }

        /**
         * Creates a dependency provider for jgitJsch (org.eclipse.jgit:org.eclipse.jgit.ssh.jsch)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJgitJsch() { return create("jgitJsch"); }

        /**
         * Creates a dependency provider for jiraRestClientApi (com.atlassian.jira:jira-rest-java-client-api)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJiraRestClientApi() { return create("jiraRestClientApi"); }

        /**
         * Creates a dependency provider for jiraRestClientApp (com.atlassian.jira:jira-rest-java-client-app)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJiraRestClientApp() { return create("jiraRestClientApp"); }

        /**
         * Creates a dependency provider for jruby (org.jruby:jruby-complete)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJruby() { return create("jruby"); }

        /**
         * Creates a dependency provider for jschAgentProxy (com.jcraft:jsch.agentproxy.jsch)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJschAgentProxy() { return create("jschAgentProxy"); }

        /**
         * Creates a dependency provider for jslt (com.schibsted.spt.data:jslt)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJslt() { return create("jslt"); }

        /**
         * Creates a dependency provider for jsonSchemaValidator (com.networknt:json-schema-validator)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJsonSchemaValidator() { return create("jsonSchemaValidator"); }

        /**
         * Creates a dependency provider for kotestAssertionsCore (io.kotest:kotest-assertions-core)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKotestAssertionsCore() { return create("kotestAssertionsCore"); }

        /**
         * Creates a dependency provider for kotestAssertionsJson (io.kotest:kotest-assertions-json)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKotestAssertionsJson() { return create("kotestAssertionsJson"); }

        /**
         * Creates a dependency provider for kotestExtensionsJunitXml (io.kotest:kotest-extensions-junitxml)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKotestExtensionsJunitXml() { return create("kotestExtensionsJunitXml"); }

        /**
         * Creates a dependency provider for kotestFrameworkApi (io.kotest:kotest-framework-api)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKotestFrameworkApi() { return create("kotestFrameworkApi"); }

        /**
         * Creates a dependency provider for kotestFrameworkEngine (io.kotest:kotest-framework-engine)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKotestFrameworkEngine() { return create("kotestFrameworkEngine"); }

        /**
         * Creates a dependency provider for kotestRunnerJunit5 (io.kotest:kotest-runner-junit5)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKotestRunnerJunit5() { return create("kotestRunnerJunit5"); }

        /**
         * Creates a dependency provider for kotlinxCoroutines (org.jetbrains.kotlinx:kotlinx-coroutines-core)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKotlinxCoroutines() { return create("kotlinxCoroutines"); }

        /**
         * Creates a dependency provider for kotlinxHtml (org.jetbrains.kotlinx:kotlinx-html-jvm)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKotlinxHtml() { return create("kotlinxHtml"); }

        /**
         * Creates a dependency provider for kotlinxSerialization (org.jetbrains.kotlinx:kotlinx-serialization-json)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKotlinxSerialization() { return create("kotlinxSerialization"); }

        /**
         * Creates a dependency provider for ktorClientCore (io.ktor:ktor-client-core)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKtorClientCore() { return create("ktorClientCore"); }

        /**
         * Creates a dependency provider for ktorClientOkHttp (io.ktor:ktor-client-okhttp)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKtorClientOkHttp() { return create("ktorClientOkHttp"); }

        /**
         * Creates a dependency provider for log4jApi (org.apache.logging.log4j:log4j-api)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getLog4jApi() { return create("log4jApi"); }

        /**
         * Creates a dependency provider for log4jApiKotlin (org.apache.logging.log4j:log4j-api-kotlin)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getLog4jApiKotlin() { return create("log4jApiKotlin"); }

        /**
         * Creates a dependency provider for log4jCore (org.apache.logging.log4j:log4j-core)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getLog4jCore() { return create("log4jCore"); }

        /**
         * Creates a dependency provider for log4jImplSlf4j (org.apache.logging.log4j:log4j-slf4j-impl)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getLog4jImplSlf4j() { return create("log4jImplSlf4j"); }

        /**
         * Creates a dependency provider for mavenCompat (org.apache.maven:maven-compat)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMavenCompat() { return create("mavenCompat"); }

        /**
         * Creates a dependency provider for mavenCore (org.apache.maven:maven-core)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMavenCore() { return create("mavenCore"); }

        /**
         * Creates a dependency provider for mavenResolverConnectorBasic (org.apache.maven.resolver:maven-resolver-connector-basic)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMavenResolverConnectorBasic() { return create("mavenResolverConnectorBasic"); }

        /**
         * Creates a dependency provider for mavenResolverTransportFile (org.apache.maven.resolver:maven-resolver-transport-file)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMavenResolverTransportFile() { return create("mavenResolverTransportFile"); }

        /**
         * Creates a dependency provider for mavenResolverTransportHttp (org.apache.maven.resolver:maven-resolver-transport-http)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMavenResolverTransportHttp() { return create("mavenResolverTransportHttp"); }

        /**
         * Creates a dependency provider for mavenResolverTransportWagon (org.apache.maven.resolver:maven-resolver-transport-wagon)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMavenResolverTransportWagon() { return create("mavenResolverTransportWagon"); }

        /**
         * Creates a dependency provider for mockk (io.mockk:mockk)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMockk() { return create("mockk"); }

        /**
         * Creates a dependency provider for okhttp (com.squareup.okhttp3:okhttp)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getOkhttp() { return create("okhttp"); }

        /**
         * Creates a dependency provider for poiOoxml (org.apache.poi:poi-ooxml)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPoiOoxml() { return create("poiOoxml"); }

        /**
         * Creates a dependency provider for postgres (org.postgresql:postgresql)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPostgres() { return create("postgres"); }

        /**
         * Creates a dependency provider for postgresEmbedded (com.opentable.components:otj-pg-embedded)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPostgresEmbedded() { return create("postgresEmbedded"); }

        /**
         * Creates a dependency provider for reflections (org.reflections:reflections)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getReflections() { return create("reflections"); }

        /**
         * Creates a dependency provider for retrofit (com.squareup.retrofit2:retrofit)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getRetrofit() { return create("retrofit"); }

        /**
         * Creates a dependency provider for retrofitConverterJackson (com.squareup.retrofit2:converter-jackson)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getRetrofitConverterJackson() { return create("retrofitConverterJackson"); }

        /**
         * Creates a dependency provider for retrofitConverterKotlinxSerialization (com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getRetrofitConverterKotlinxSerialization() { return create("retrofitConverterKotlinxSerialization"); }

        /**
         * Creates a dependency provider for retrofitConverterScalars (com.squareup.retrofit2:converter-scalars)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getRetrofitConverterScalars() { return create("retrofitConverterScalars"); }

        /**
         * Creates a dependency provider for saxonHe (net.sf.saxon:Saxon-HE)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSaxonHe() { return create("saxonHe"); }

        /**
         * Creates a dependency provider for scanoss (com.scanoss:scanner)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getScanoss() { return create("scanoss"); }

        /**
         * Creates a dependency provider for semver4j (com.vdurmont:semver4j)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSemver4j() { return create("semver4j"); }

        /**
         * Creates a dependency provider for springCore (org.springframework:spring-core)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSpringCore() { return create("springCore"); }

        /**
         * Creates a dependency provider for svnkit (org.tmatesoft.svnkit:svnkit)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSvnkit() { return create("svnkit"); }

        /**
         * Creates a dependency provider for sw360Client (org.eclipse.sw360:client)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSw360Client() { return create("sw360Client"); }

        /**
         * Creates a dependency provider for toml4j (com.moandjiezana.toml:toml4j)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getToml4j() { return create("toml4j"); }

        /**
         * Creates a dependency provider for wiremock (com.github.tomakehurst:wiremock-jre8)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getWiremock() { return create("wiremock"); }

        /**
         * Creates a dependency provider for xz (org.tukaani:xz)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getXz() { return create("xz"); }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() { return vaccForVersionAccessors; }

    /**
     * Returns the group of bundles at bundles
     */
    public BundleAccessors getBundles() { return baccForBundleAccessors; }

    /**
     * Returns the group of plugins at plugins
     */
    public PluginAccessors getPlugins() { return paccForPluginAccessors; }

    public static class VersionAccessors extends VersionFactory  {

        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: antlr (4.9.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAntlr() { return getVersion("antlr"); }

            /**
             * Returns the version associated to this alias: asciidoctorj (2.5.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAsciidoctorj() { return getVersion("asciidoctorj"); }

            /**
             * Returns the version associated to this alias: asciidoctorjPdf (2.1.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAsciidoctorjPdf() { return getVersion("asciidoctorjPdf"); }

            /**
             * Returns the version associated to this alias: buildConfigPlugin (3.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getBuildConfigPlugin() { return getVersion("buildConfigPlugin"); }

            /**
             * Returns the version associated to this alias: clikt (3.5.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getClikt() { return getVersion("clikt"); }

            /**
             * Returns the version associated to this alias: commonsCompress (1.21)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCommonsCompress() { return getVersion("commonsCompress"); }

            /**
             * Returns the version associated to this alias: commonsEmail (1.5)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCommonsEmail() { return getVersion("commonsEmail"); }

            /**
             * Returns the version associated to this alias: config4k (0.4.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getConfig4k() { return getVersion("config4k"); }

            /**
             * Returns the version associated to this alias: cvssCalculator (1.4.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCvssCalculator() { return getVersion("cvssCalculator"); }

            /**
             * Returns the version associated to this alias: cyclonedx (7.2.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCyclonedx() { return getVersion("cyclonedx"); }

            /**
             * Returns the version associated to this alias: detektPlugin (1.21.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getDetektPlugin() { return getVersion("detektPlugin"); }

            /**
             * Returns the version associated to this alias: digraphParser (1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getDigraphParser() { return getVersion("digraphParser"); }

            /**
             * Returns the version associated to this alias: diskLruCache (2.0.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getDiskLruCache() { return getVersion("diskLruCache"); }

            /**
             * Returns the version associated to this alias: dokkaPlugin (1.7.10)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getDokkaPlugin() { return getVersion("dokkaPlugin"); }

            /**
             * Returns the version associated to this alias: exposed (0.38.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getExposed() { return getVersion("exposed"); }

            /**
             * Returns the version associated to this alias: flexmark (0.64.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getFlexmark() { return getVersion("flexmark"); }

            /**
             * Returns the version associated to this alias: freemarker (2.3.31)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getFreemarker() { return getVersion("freemarker"); }

            /**
             * Returns the version associated to this alias: graal (22.2.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGraal() { return getVersion("graal"); }

            /**
             * Returns the version associated to this alias: graalPlugin (0.12.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGraalPlugin() { return getVersion("graalPlugin"); }

            /**
             * Returns the version associated to this alias: graphQlPlugin (5.5.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGraphQlPlugin() { return getVersion("graphQlPlugin"); }

            /**
             * Returns the version associated to this alias: greenmail (1.6.9)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGreenmail() { return getVersion("greenmail"); }

            /**
             * Returns the version associated to this alias: hikari (5.0.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getHikari() { return getVersion("hikari"); }

            /**
             * Returns the version associated to this alias: hoplite (2.4.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getHoplite() { return getVersion("hoplite"); }

            /**
             * Returns the version associated to this alias: ideaExtPlugin (1.1.5)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getIdeaExtPlugin() { return getVersion("ideaExtPlugin"); }

            /**
             * Returns the version associated to this alias: jackson (2.13.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJackson() { return getVersion("jackson"); }

            /**
             * Returns the version associated to this alias: jgit (6.2.0.202206071550-r)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJgit() { return getVersion("jgit"); }

            /**
             * Returns the version associated to this alias: jiraRestClient (5.2.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJiraRestClient() { return getVersion("jiraRestClient"); }

            /**
             * Returns the version associated to this alias: jruby (9.3.6.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJruby() { return getVersion("jruby"); }

            /**
             * Returns the version associated to this alias: jschAgentProxy (0.0.7)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJschAgentProxy() { return getVersion("jschAgentProxy"); }

            /**
             * Returns the version associated to this alias: jslt (0.1.12)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJslt() { return getVersion("jslt"); }

            /**
             * Returns the version associated to this alias: jsonSchemaValidator (1.0.72)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJsonSchemaValidator() { return getVersion("jsonSchemaValidator"); }

            /**
             * Returns the version associated to this alias: kotest (5.4.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotest() { return getVersion("kotest"); }

            /**
             * Returns the version associated to this alias: kotlinPlugin (1.7.10)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlinPlugin() { return getVersion("kotlinPlugin"); }

            /**
             * Returns the version associated to this alias: kotlinxCoroutines (1.6.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlinxCoroutines() { return getVersion("kotlinxCoroutines"); }

            /**
             * Returns the version associated to this alias: kotlinxHtml (0.8.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlinxHtml() { return getVersion("kotlinxHtml"); }

            /**
             * Returns the version associated to this alias: kotlinxSerialization (1.3.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlinxSerialization() { return getVersion("kotlinxSerialization"); }

            /**
             * Returns the version associated to this alias: ktor (1.6.8)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKtor() { return getVersion("ktor"); }

            /**
             * Returns the version associated to this alias: log4j (2.18.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getLog4j() { return getVersion("log4j"); }

            /**
             * Returns the version associated to this alias: log4jApiKotlin (1.2.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getLog4jApiKotlin() { return getVersion("log4jApiKotlin"); }

            /**
             * Returns the version associated to this alias: maven (3.8.6)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMaven() { return getVersion("maven"); }

            /**
             * Returns the version associated to this alias: mavenResolver (1.7.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMavenResolver() { return getVersion("mavenResolver"); }

            /**
             * Returns the version associated to this alias: mockk (1.12.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMockk() { return getVersion("mockk"); }

            /**
             * Returns the version associated to this alias: okhttp (4.9.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getOkhttp() { return getVersion("okhttp"); }

            /**
             * Returns the version associated to this alias: poiOoxml (5.2.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPoiOoxml() { return getVersion("poiOoxml"); }

            /**
             * Returns the version associated to this alias: postgres (42.4.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPostgres() { return getVersion("postgres"); }

            /**
             * Returns the version associated to this alias: postgresEmbedded (1.0.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPostgresEmbedded() { return getVersion("postgresEmbedded"); }

            /**
             * Returns the version associated to this alias: reflections (0.10.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getReflections() { return getVersion("reflections"); }

            /**
             * Returns the version associated to this alias: retrofit (2.9.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRetrofit() { return getVersion("retrofit"); }

            /**
             * Returns the version associated to this alias: retrofitConverterKotlinxSerialization (0.8.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRetrofitConverterKotlinxSerialization() { return getVersion("retrofitConverterKotlinxSerialization"); }

            /**
             * Returns the version associated to this alias: saxonHe (11.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getSaxonHe() { return getVersion("saxonHe"); }

            /**
             * Returns the version associated to this alias: scanoss (1.1.6)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getScanoss() { return getVersion("scanoss"); }

            /**
             * Returns the version associated to this alias: semver4j (3.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getSemver4j() { return getVersion("semver4j"); }

            /**
             * Returns the version associated to this alias: shadowPlugin (7.1.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getShadowPlugin() { return getVersion("shadowPlugin"); }

            /**
             * Returns the version associated to this alias: springCore (5.3.22)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getSpringCore() { return getVersion("springCore"); }

            /**
             * Returns the version associated to this alias: svnToolsPlugin (3.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getSvnToolsPlugin() { return getVersion("svnToolsPlugin"); }

            /**
             * Returns the version associated to this alias: svnkit (1.10.7)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getSvnkit() { return getVersion("svnkit"); }

            /**
             * Returns the version associated to this alias: sw360Client (13.2.0-28)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getSw360Client() { return getVersion("sw360Client"); }

            /**
             * Returns the version associated to this alias: taskInfoPlugin (1.4.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getTaskInfoPlugin() { return getVersion("taskInfoPlugin"); }

            /**
             * Returns the version associated to this alias: toml4j (0.7.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getToml4j() { return getVersion("toml4j"); }

            /**
             * Returns the version associated to this alias: versionCatalogUpdatePlugin (0.5.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersionCatalogUpdatePlugin() { return getVersion("versionCatalogUpdatePlugin"); }

            /**
             * Returns the version associated to this alias: versionsPlugin (0.42.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersionsPlugin() { return getVersion("versionsPlugin"); }

            /**
             * Returns the version associated to this alias: wiremock (2.33.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getWiremock() { return getVersion("wiremock"); }

            /**
             * Returns the version associated to this alias: xz (1.9)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getXz() { return getVersion("xz"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a dependency bundle provider for exposed which is an aggregate for the following dependencies:
             * <ul>
             *    <li>org.jetbrains.exposed:exposed-core</li>
             *    <li>org.jetbrains.exposed:exposed-dao</li>
             *    <li>org.jetbrains.exposed:exposed-jdbc</li>
             *    <li>org.jetbrains.exposed:exposed-java-time</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getExposed() { return createBundle("exposed"); }

            /**
             * Creates a dependency bundle provider for hoplite which is an aggregate for the following dependencies:
             * <ul>
             *    <li>com.sksamuel.hoplite:hoplite-core</li>
             *    <li>com.sksamuel.hoplite:hoplite-hocon</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getHoplite() { return createBundle("hoplite"); }

            /**
             * Creates a dependency bundle provider for maven which is an aggregate for the following dependencies:
             * <ul>
             *    <li>org.apache.maven:maven-core</li>
             *    <li>org.apache.maven:maven-compat</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getMaven() { return createBundle("maven"); }

            /**
             * Creates a dependency bundle provider for mavenResolver which is an aggregate for the following dependencies:
             * <ul>
             *    <li>org.apache.maven.resolver:maven-resolver-connector-basic</li>
             *    <li>org.apache.maven.resolver:maven-resolver-transport-file</li>
             *    <li>org.apache.maven.resolver:maven-resolver-transport-http</li>
             *    <li>org.apache.maven.resolver:maven-resolver-transport-wagon</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getMavenResolver() { return createBundle("mavenResolver"); }

    }

    public static class PluginAccessors extends PluginFactory {

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for buildConfig to the plugin id 'com.github.gmazzo.buildconfig'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getBuildConfig() { return createPlugin("buildConfig"); }

            /**
             * Creates a plugin provider for detekt to the plugin id 'io.gitlab.arturbosch.detekt'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getDetekt() { return createPlugin("detekt"); }

            /**
             * Creates a plugin provider for dokka to the plugin id 'org.jetbrains.dokka'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getDokka() { return createPlugin("dokka"); }

            /**
             * Creates a plugin provider for graal to the plugin id 'com.palantir.graal'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getGraal() { return createPlugin("graal"); }

            /**
             * Creates a plugin provider for graphQl to the plugin id 'com.expediagroup.graphql'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getGraphQl() { return createPlugin("graphQl"); }

            /**
             * Creates a plugin provider for ideaExt to the plugin id 'org.jetbrains.gradle.plugin.idea-ext'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getIdeaExt() { return createPlugin("ideaExt"); }

            /**
             * Creates a plugin provider for kotlin to the plugin id 'org.jetbrains.kotlin.jvm'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getKotlin() { return createPlugin("kotlin"); }

            /**
             * Creates a plugin provider for kotlinSerialization to the plugin id 'org.jetbrains.kotlin.plugin.serialization'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getKotlinSerialization() { return createPlugin("kotlinSerialization"); }

            /**
             * Creates a plugin provider for shadow to the plugin id 'com.github.johnrengelman.shadow'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getShadow() { return createPlugin("shadow"); }

            /**
             * Creates a plugin provider for svnTools to the plugin id 'at.bxm.svntools'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getSvnTools() { return createPlugin("svnTools"); }

            /**
             * Creates a plugin provider for taskInfo to the plugin id 'org.barfuin.gradle.taskinfo'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getTaskInfo() { return createPlugin("taskInfo"); }

            /**
             * Creates a plugin provider for versionCatalogUpdate to the plugin id 'nl.littlerobots.version-catalog-update'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getVersionCatalogUpdate() { return createPlugin("versionCatalogUpdate"); }

            /**
             * Creates a plugin provider for versions to the plugin id 'com.github.ben-manes.versions'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getVersions() { return createPlugin("versions"); }

    }

}
