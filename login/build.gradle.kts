plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    defaultConfig {
        minSdk = 22
        targetSdk = 33
        namespace = "com.poc.cyclone.login"
        compileSdk = 33
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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

    implementation("com.airbnb.android:lottie:3.4.0")
}