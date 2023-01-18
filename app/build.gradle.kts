plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.poc.cyclone"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.poc.cyclone"
        minSdk = 22
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary =  true
        }
    }

    buildTypes {
        debug {
            isMinifyEnabled = false
        }
        release {
            isMinifyEnabled = true
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.2.0"
    }

    packagingOptions {
        resources.excludes.add("/META-INF/{AL2.0,LGPL2.1}")
    }
}

dependencies {
    implementation(project(mapOf("path" to ":login", "configuration" to "default")))

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.5.1")

    implementation("androidx.activity:activity-compose:1.6.1")
    implementation("androidx.compose.ui:ui:1.3.3")
    implementation("androidx.compose.ui:ui-tooling-preview:1.3.3")
    implementation("androidx.compose.material:material:1.3.1")
    implementation("androidx.constraintlayout:constraintlayout-compose:1.0.1")

    implementation("io.insert-koin:koin-android:3.3.2")
    implementation("io.insert-koin:koin-android-compat:3.3.2")
    implementation("io.insert-koin:koin-androidx-workmanager:3.3.2")
    implementation("io.insert-koin:koin-androidx-navigation:3.3.2")
    implementation("io.insert-koin:koin-androidx-compose:3.4.1")
    implementation("io.insert-koin:koin-core:3.3.2")

    testImplementation("io.insert-koin:koin-test:3.3.2")
    testImplementation("io.insert-koin:koin-test-junit4:3.3.2")
    testImplementation("io.insert-koin:koin-test-junit5:3.3.2")
    testImplementation("junit:junit:4.13.2")

    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.3.3")

    debugImplementation("androidx.compose.ui:ui-tooling:1.3.3")
    debugImplementation("androidx.compose.ui:ui-test-manifest:1.3.3")
}