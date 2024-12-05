plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    //kapt
    id("kotlin-kapt")
}

android {
    namespace = "com.example.testwcdb"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.testwcdb"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation("com.tencent.wcdb:main:2.1.9") // WCDB主模块，包含所有类和接口
    implementation("com.tencent.wcdb:annotation:2.1.9") // Android平台相关的库
    kapt("com.tencent.wcdb:compiler:2.1.9") // WCDB编译器，用于生成数据库访问类
}