import org.gradle.api.plugins.*
import org.gradle.api.tasks.wrapper.*
import org.gradle.script.lang.kotlin.*

group = "gradle-meets-kotlin"
version = "1.0.0-SNAPSHOT"
val kotlinVersion by extra.properties

apply {
    plugin("application")
}

configure<ApplicationPluginConvention> {
    mainClassName = "samples.HelloWorld"
    applicationName = "gradle-meets-kotlin"
}

repositories {
    jcenter()
    mavenCentral()
}

dependencies {
    "testCompile"("junit:junit:4.12")
}
