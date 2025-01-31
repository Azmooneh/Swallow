import java.util.Properties
import java.io.FileInputStream

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.google.gms.google.services)
    alias(libs.plugins.google.firebase.crashlytics)
}

android {
    val localProperties = Properties().apply {
        load(FileInputStream(File(rootProject.rootDir, "local.properties")))
    }

    signingConfigs {
        create("arabic") {
            keyAlias = localProperties.getProperty("arabic.key.alias")
            keyPassword = localProperties.getProperty("arabic.package")
            storeFile = file(localProperties.getProperty("arabic.store.file"))
            storePassword = localProperties.getProperty("arabic.package")
        }
        create("chinese") {
            keyAlias = localProperties.getProperty("chinese.key.alias")
            keyPassword = localProperties.getProperty("chinese.package")
            storeFile = file(localProperties.getProperty("chinese.store.file"))
            storePassword = localProperties.getProperty("chinese.package")
        }
        create("english") {
            keyAlias = localProperties.getProperty("english.key.alias")
            keyPassword = localProperties.getProperty("english.package")
            storeFile = file(localProperties.getProperty("english.store.file"))
            storePassword = localProperties.getProperty("english.package")
        }
        create("french") {
            keyAlias = localProperties.getProperty("french.key.alias")
            keyPassword = localProperties.getProperty("french.package")
            storeFile = file(localProperties.getProperty("french.store.file"))
            storePassword = localProperties.getProperty("french.package")
        }
        create("germany") {
            keyAlias = localProperties.getProperty("germany.key.alias")
            keyPassword = localProperties.getProperty("germany.package")
            storeFile = file(localProperties.getProperty("germany.store.file"))
            storePassword = localProperties.getProperty("germany.package")
        }
        create("italy") {
            keyAlias = localProperties.getProperty("italy.key.alias")
            keyPassword = localProperties.getProperty("italy.package")
            storeFile = file(localProperties.getProperty("italy.store.file"))
            storePassword = localProperties.getProperty("italy.package")
        }
        create("japan") {
            keyAlias = localProperties.getProperty("japan.key.alias")
            keyPassword = localProperties.getProperty("japan.package")
            storeFile = file(localProperties.getProperty("japan.store.file"))
            storePassword = localProperties.getProperty("japan.package")
        }
        create("korean") {
            keyAlias = localProperties.getProperty("korean.key.alias")
            keyPassword = localProperties.getProperty("korean.package")
            storeFile = file(localProperties.getProperty("korean.store.file"))
            storePassword = localProperties.getProperty("korean.package")
        }
        create("russian") {
            keyAlias = localProperties.getProperty("russian.key.alias")
            keyPassword = localProperties.getProperty("russian.package")
            storeFile = file(localProperties.getProperty("russian.store.file"))
            storePassword = localProperties.getProperty("russian.package")
        }
        create("spanish") {
            keyAlias = localProperties.getProperty("spanish.key.alias")
            keyPassword = localProperties.getProperty("spanish.package")
            storeFile = file(localProperties.getProperty("spanish.store.file"))
            storePassword = localProperties.getProperty("spanish.package")
        }
        create("turkish") {
            keyAlias = localProperties.getProperty("turkish.key.alias")
            keyPassword = localProperties.getProperty("turkish.package")
            storeFile = file(localProperties.getProperty("turkish.store.file"))
            storePassword = localProperties.getProperty("turkish.package")
        }
    }


//            if (!keystoreFile.exists()) {
//                throw GradleException("Release keystore not found!")
//            }else{
//                throw GradleException("Release keystore not founded xxxxxx")
//            }


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
            signingConfig = signingConfigs.getByName("english")
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
