pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Material3Catalog"
include(":app")
include(":material3-samples")
include(":material3-demo")
include(":material3-catalog")
include(":assist:annotation-sampled")
include(":assist:adaptive-samples")
include(":assist:demos-common")
include(":integration-demos")
