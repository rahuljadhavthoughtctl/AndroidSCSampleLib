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
/*dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://www.jitpack.io" )
          //  url = uri("https://maven.pkg.github.com/expertstack-studios/AndroidSecuredCallsVoiceSDK" )
        }
    }
}*/

/*dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()

        // Add your GitHub Packages repository
        maven {
            url = uri("https://maven.pkg.github.com/expertstack-studios/AndroidSCSampleLib")
            credentials {
                val githubUsername: String = System.getenv("GITUSERNAME") ?: "expertstack-studios"
                val githubToken: String = System.getenv("TOKEN") ?: "your-github-pat"

                println(githubUsername)
                println(githubToken)

                username = githubUsername
                password = githubToken

            }
        }
    }
}*/

rootProject.name = "SampleAppSCVoiceCall"
include(":app")
/*include(":libs:SecuredCalls.aar")
include(":libs:scVoiceDebug.aar")
include(":libs:sc_voice-release.aar")
include(":libs:sc_voice-debug.aar")*/
include(":sc_sdk")

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()

        // Add your GitHub Packages repository for a public repo
        maven {
            url = uri("https://maven.pkg.github.com/expertstack-studios/AndroidSCSampleLib")
            credentials {
               // println(System.getenv("GITUSERNAME"))
                username = System.getenv("GITUSERNAME") ?: "expertstack-studios"
                password = System.getenv("TOKEN") ?: "your-github-pat"
            }
        }
    }
}
