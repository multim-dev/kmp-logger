plugins {
    kotlin("multiplatform") version "1.8.10"
    id("maven-publish")
    id("com.android.library") version "7.0.4"
}

group = "dev.usbharu"
version = "1.1-SNAPSHOT"

repositories {
    google()
    mavenCentral()
}

kotlin {
    jvm {
        jvmToolchain(8)
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
        }
    }
    js(BOTH) {
        browser {

        }
        nodejs {

        }
    }
//    js("node", IR) {
//        binaries.executable()
//        nodejs {
//
//        }
//    }
    android {
        publishLibraryVariants("release", "debug")
    }
    sourceSets {
        val commonMain by getting
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val jvmMain by getting {
            dependencies {
                implementation("org.slf4j:slf4j-api:2.0.6")
            }
        }
        val jvmTest by getting
        val jsMain by getting
        val jsTest by getting
//        val nodeMain by getting
//        val nodeTest by getting
        val androidMain by getting
        val androidTest by getting {
            dependencies {
                implementation("junit:junit:4.13.2")
            }
        }
    }
}


//buildscript {
    ext["kotlin_version"] = "1.8.10"
//}

android {
    compileSdkVersion(31)
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdkVersion(24)
        targetSdkVersion(31)
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}
dependencies {
//    implementation("androidx.core:core-ktx:+")
}

publishing{
    repositories{
        maven{
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/usbharu/kmp-logger")
            credentials {
                username = project.findProperty("gpr.user") as String? ?: System.getenv("USERNAME")
                password = project.findProperty("gpr.key") as String? ?: System.getenv("TOKEN")
            }
        }
    }
}
