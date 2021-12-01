includeBuild(rootDir.resolve("gradle-plugin").apply {
    apply(resolve("repositories.gradle.kts"))
})