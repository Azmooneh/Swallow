// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.google.gms.google.services) apply false
    alias(libs.plugins.google.firebase.crashlytics) apply false
//    alias(libs.plugins.objectbox) apply false
//    id("io.objectbox") version "4.1.0" apply false
}


