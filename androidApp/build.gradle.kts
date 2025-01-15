plugins {
  alias(libs.plugins.androidApplication)
  alias(libs.plugins.kotlinAndroid)
  alias(libs.plugins.compose.compiler)
  alias(libs.plugins.ksp)
  //Kotlinx Serialization
  alias(libs.plugins.kotlinSerialization)
}

android {
  namespace = "idv.maxence2997.socialapp.android"
  compileSdk = 35
  defaultConfig {
    applicationId = "idv.maxence2997.socialapp.android"
    minSdk = 24
    targetSdk = 35
    versionCode = 1
    versionName = "1.0"
  }
  buildFeatures {
    compose = true
  }
  packaging {
    resources {
      excludes += "/META-INF/{AL2.0,LGPL2.1}"
    }
  }
  buildTypes {
    getByName("release") {
      isMinifyEnabled = false
    }
  }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
  }
  kotlinOptions {
    jvmTarget = "17"
  }
  buildToolsVersion = "35.0.1"

  applicationVariants.all {
    addJavaSourceFoldersToModel(
      layout.buildDirectory.dir("generated/ksp/$name/kotlin").get().asFile
    )
  }
}

dependencies {
  implementation(projects.shared)
  implementation(libs.compose.ui)
  implementation(libs.compose.ui.tooling.preview)
  implementation(libs.compose.material3)
  implementation(libs.androidx.activity.compose)
  debugImplementation(libs.compose.ui.tooling)

  implementation(libs.core)
  ksp(libs.ksp)
  implementation(libs.androidx.core.splashscreen)
  implementation(libs.koin.androidx.compose)
  implementation(libs.androidx.lifecycle.runtime.compose)
  implementation(libs.accompanist.systemuicontroller)
  implementation(libs.coil.compose)
}