rootProject.name = "BuddyBuild"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
  repositories {
    google()
    gradlePluginPortal()
    mavenCentral()
    maven("https://androidx.dev/storage/compose-compiler/repository/")
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    maven("https://maven.pkg.jetbrains.space/kotlin/p/wasm/experimental")
  }
}

dependencyResolutionManagement {
  repositories {
    google()
    mavenCentral()
    maven("https://androidx.dev/storage/compose-compiler/repository/")
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    maven("https://maven.pkg.jetbrains.space/kotlin/p/wasm/experimental")
  }
}

include(":common")
include(":composeApp")