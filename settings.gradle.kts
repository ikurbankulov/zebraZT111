pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }


}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven("https://zebratech.jfrog.io/artifactory/EMDK-Android/")
    }
}

rootProject.name = "zebraZT111"
include(":app")
 