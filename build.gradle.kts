plugins {
    id("java")
    alias(libs.plugins.jetbrains.intellij)
    alias(libs.plugins.jetbrains.kotlin.jvm)
}

group = "com.helloworld"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()

    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    intellijPlatform {
        // comment out line 21 and uncomment line 22 to break build
        intellijIdeaCommunity("2024.3.1")
        // local("/Applications/IntelliJ IDEA CE.app/Contents")

        bundledPlugin("com.intellij.java")
    }

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}