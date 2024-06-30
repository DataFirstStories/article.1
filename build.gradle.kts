plugins {
    kotlin("jvm") version "2.0.0"
}

group = "org.data.first"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(21)
}