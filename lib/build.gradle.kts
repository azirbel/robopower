plugins {
    kotlin("jvm") version libs.versions.kotlin
    alias(libs.plugins.detekt)
}

dependencies {
    api(libs.coroutines)
}
