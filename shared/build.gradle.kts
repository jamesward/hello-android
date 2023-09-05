plugins {
    kotlin("multiplatform")
    id("com.android.kotlin.multiplatform.library")
    id("org.jetbrains.compose")
}

kotlin {
    targetHierarchy.default()

    androidLibrary {
        namespace = "com.google.samples.apps.diceroller.shared"
        compileSdk = 34
    }

    sourceSets {
        getByName("commonMain") {
            dependencies {
                api(project(":rpc"))

                implementation(compose.ui)
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material3)
            }
        }
    }
}
