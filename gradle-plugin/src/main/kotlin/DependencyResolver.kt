import org.gradle.api.Plugin
import org.gradle.api.Project

open class DependencyResolver : Plugin<Project> {
    override fun apply(project: Project) = project.run {
        val dependency = dependencies.create("org.apache.commons:commons-lang3:3.11")
        val configuration = configurations.detachedConfiguration(dependency)
        val result = configuration.resolve()
        println(result)


    }
}