plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.example.sampleappscvoicecall"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.sampleappscvoicecall"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

/*repositories {
    maven {
        url = uri("https://maven.pkg.github.com/expertstack-studios/AndroidSecuredCallsVoiceSDK" )
    }
}*/
/*allprojects {
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://www.jitpack.io")
        }
    }
}*/

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
   // debugImplementation("libs/SecuredCalls.aar")
   // implementation(project.project(":libs:SecuredCalls.aar"))
   // implementation(project.project(":libs:scVoiceDebug.aar"))
   // debugImplementation(files("libs/SecuredCalls.aar"))
   // debugImplementation(files("libs/sc_voice-release.aar"))
   // api(files("libs/sc-sdk-1.0.0.aar"))
   // api(files("libs/sc_sdk-release.aar"))

   // implementation("com.google.code.gson:gson:2.11.0")
   // implementation(libs.calls.sdk) // Replace with your package coordinates
    implementation(libs.sc.sdk) // Replace with your package coordinates
    //api("com.github.expertstack-studios:AndroidSCSampleLib:1.0.5")
   // api("com.github.expertstack-studios:sc-android-lib:c03d410656")
   // debugImplementation("com.es.sc.voice:sc_voice-debug:1.0.0")
   // debugImplementation("com.example.sc_sdk:sc_sdk-debug:1.0.0")
   // implementation("com.github.expertstack-studios:AndroidSecuredCallsVoiceSDK:-SNAPSHOT")
}