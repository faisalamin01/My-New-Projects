plugins { id("com.android.application") }
android {
    namespace = "com.roaddream.studio"
    compileSdk = 35
    defaultConfig {
        applicationId = "com.roaddream.studio"
        minSdk = 26
        targetSdk = 35
        versionCode = 300
        versionName = "3.0-native"
    }
    compileOptions { sourceCompatibility = JavaVersion.VERSION_17; targetCompatibility = JavaVersion.VERSION_17 }
    buildTypes { getByName("release") { isMinifyEnabled = false } }
}
