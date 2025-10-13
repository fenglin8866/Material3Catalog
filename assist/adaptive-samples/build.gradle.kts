plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "androidx.compose.material3.adaptive.samples"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        minSdk = 29

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(libs.androidx.compose.material.icons.extended)
    implementation(libs.androidx.compose.material)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.androidx.datastore.preferences)
    implementation(libs.androidx.compose.material3.window.size.class1.android)

    implementation(libs.androidx.compose.adaptive)
    implementation(libs.androidx.compose.runtime)
    implementation(libs.androidx.ui)
    implementation(libs.androidx.compose.ui.text)
    implementation(libs.androidx.savedstate.ktx)
    implementation(libs.androidx.ui.tooling)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.graphics.shapes)

    implementation("androidx.compose.material3:material3:1.5.0-alpha06")
    implementation("androidx.compose.material3:material3-adaptive-navigation-suite:1.5.0-alpha06")


    implementation("androidx.compose.material3.adaptive:adaptive:1.3.0-alpha01")
    implementation("androidx.compose.material3.adaptive:adaptive-layout:1.3.0-alpha01")
    implementation("androidx.compose.material3.adaptive:adaptive-navigation:1.3.0-alpha01")
    implementation("androidx.compose.material3.adaptive:adaptive-navigation3-android:1.3.0-alpha01")

    implementation(project(":assist:annotation-sampled"))

}