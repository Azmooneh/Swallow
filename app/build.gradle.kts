plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.google.gms.google.services)
    alias(libs.plugins.google.firebase.crashlytics)
}

android {
    namespace = "com.azmooneh.swallow"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.azmooneh.swallow"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
        multiDexEnabled = true

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
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)

    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)


    /* SDP/SSP: A scalable size unit */
    implementation(libs.sdp.scalable)
    implementation(libs.ssp.scalable)
    /* Hawk: Secure storage key-value */
    implementation(files("libs/hawk-2.1.0-custom.aar"))
    implementation(libs.conceal)
    /* Calligraphy: Custom font */
    implementation(libs.calligraphy3)
    implementation(libs.viewpump)
    /* Auto Fit TextView */
    implementation(libs.autofittextview)
    /* Shimmer: Animation --DEPRECATED */
    implementation(libs.shimmerlayout)
    /* Ribbon */
    implementation(libs.androidribbon)
    /* Transitions: Animation */
    implementation(libs.transitionseverywhere)
    /* Yoyo: Animation */
    implementation(libs.yoyo.easing)
    implementation(libs.yoyo.library)
    /* Lottie: Animation */
    implementation(libs.lottie)
    /* Blurry */
    implementation(libs.blurry)
    /* Switch button */
    implementation(libs.switch.button)
    /* Permission */
    implementation(libs.tedpermission)
    /* Network: Internet data transfer */
    implementation(libs.retrofit)
    implementation(libs.converter.gson)
    implementation(libs.okhttp)
    implementation(libs.logging.interceptor)
    implementation(libs.picasso)
//    implementation(libs.android.networking)
    implementation(libs.glide)
    /* ZarinPal: Purchase SDK */
//    implementation(libs.zarinpal)
    /* Charkhoneh: Purchase SDK v5.2 */
    implementation(files("libs/inAppPurchase.aar"))
    /* Tapsell: Advertising service */
    implementation(libs.tapsell.plus)
    /* Dependency injection: Dagger */
    implementation(libs.dagger)
    annotationProcessor(libs.dagger.compiler)
    /* Firebase services */
    implementation(libs.firebase.messaging)
    implementation(libs.firebase.inappmessaging.display)
    implementation(libs.firebase.crashlytics)
    implementation(libs.firebase.analytics)
    /* Utility */
    implementation(libs.multidex)
    implementation(libs.guava)
    implementation(libs.gson)
    implementation(libs.cardview)
    /* Lifecycle */
    implementation(libs.lifecycle.viewmodel)
    implementation(libs.lifecycle.viewmodel.ktx)
}
