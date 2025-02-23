plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.navigationapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.navigationapp"
        minSdk = 24
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    val nav_version = "2.7.7"

    // Java language implementation
    //noinspection UseTomlInstead
    implementation("androidx.navigation:navigation-fragment:$nav_version")
    //noinspection UseTomlInstead
    implementation("androidx.navigation:navigation-ui:$nav_version")

}