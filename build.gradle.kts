plugins {
    id("com.android.application") version "7.4.0" apply false
    id("com.android.library") version "7.4.0" apply false
    id("org.jetbrains.kotlin.android") version "1.7.0" apply false
    id("org.cyclonedx.bom") version "1.7.3"
}

buildscript {
    dependencies {
        classpath("com.android.tools.build:gradle:7.4.0")
    }
}

group = "group"

tasks.cyclonedxBom {
    setIncludeConfigs(listOf("debugCompileClasspath"))
    setSkipConfigs(listOf("compileClasspath", "testCompileClasspath"))
    setSkipProjects(listOf(rootProject.name))
    setProjectType("application")
    setSchemaVersion("1.4")
    setDestination(project.file("build/reports"))
    setOutputName("bom")
    setIncludeBomSerialNumber(false)
    setComponentVersion("2.0.0")
}
