plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("maven-publish")
}

android {
    namespace = "com.example.sc_sdk"
    compileSdk = 34

    defaultConfig {
        minSdk = 26

        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

/*allprojects {
    repositories {
        google()
        mavenCentral()
        mavenLocal()       
    }
}*/

dependencies {

  /*  implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)*/
    implementation("com.google.code.gson:gson:2.11.0"){
        isTransitive = true
    }
}

// 4. Add This Java Blocs:
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)        // << --- ADD This
    }
}


java {
    sourceCompatibility = JavaVersion.VERSION_17            // << --- ADD This
    targetCompatibility = JavaVersion.VERSION_17
}



// 5. Publishing:
/*publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.github.expertstack-studios"
            artifactId = "AndroidSCSampleLib"
            version = "1.0.0"
 
            pom {
                description.set("DESCRIPTION")
 withXml {
                    asNode().appendNode("dependencies").apply {
                        appendNode("dependency").apply {
                            appendNode("groupId", "com.google.code.gson")
                            appendNode("artifactId", "gson")
                            appendNode("version", "2.11.0")
                            appendNode("scope", "compile")
                        }
                        // Add more dependencies here as needed
                    }
                }
            }
        }
    }
 
    repositories {
        mavenLocal()
    }
} */


// Publishing configuration
afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("release") {
                from(components["release"])
                groupId = "com.example.sc_sdk"
                artifactId = "sc-sdk"
                version = "1.0.0"
            }
        }

        repositories {
            maven {
            //    name = "github"
                url = uri("https://maven.pkg.github.com/expertstack-studios/AndroidSCSampleLib")
                credentials {
                    username = project.findProperty("gpr.user") as String? ?: System.getenv("GITUSERNAME")
                    password = project.findProperty("gpr.token") as String? ?: System.getenv("TOKEN")
                }
            }
        }
    }
}
