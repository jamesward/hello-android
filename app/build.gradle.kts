plugins {
    id("com.android.application")
    kotlin("android")
}

repositories {
    mavenCentral()
    google()
    maven("https://androidx.dev/storage/compose-compiler/repository/")
}

kotlin {
    jvmToolchain(8)
}

android {
    namespace = "com.example.myapplication"
    compileSdk = 33
    defaultConfig {
        minSdk = 24
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.7-dev-k1.9.0-Beta-bb7dc8b44eb"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation("androidx.activity:activity-compose:1.7.1")
    implementation("androidx.compose.ui:ui:1.4.3")
    implementation("androidx.compose.ui:ui-tooling-preview:1.4.3")
    implementation("androidx.compose.material:material:1.4.3")
    debugImplementation("androidx.compose.ui:ui-tooling:1.4.3")
}
