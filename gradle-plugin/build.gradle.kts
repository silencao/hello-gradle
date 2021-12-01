import org.gradle.kotlin.dsl.support.expectedKotlinDslPluginsVersion

plugins {
    `java-gradle-plugin`

    kotlin("jvm") version embeddedKotlinVersion
}

dependencies {
    println(expectedKotlinDslPluginsVersion)
}

