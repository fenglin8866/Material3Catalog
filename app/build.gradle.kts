plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "androidx.compose.material3.catalog.library"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        applicationId = "androidx.compose.material3.catalog.library"
        minSdk = 29
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    //implementation(libs.androidx.compose.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    debugImplementation(libs.androidx.compose.ui.tooling)
    debugImplementation(libs.androidx.compose.ui.test.manifest)

    /*    implementation("androidx.core:core:1.12.0")
        implementation("androidx.compose.runtime:runtime:1.8.0")
        implementation("androidx.compose.foundation:foundation:1.8.0")
        implementation("androidx.compose.foundation:foundation-layout:1.9.3")
        implementation("androidx.compose.ui:ui:1.9.3")*/
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

    implementation(project(":samples"))
}