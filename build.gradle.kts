plugins {
    kotlin("jvm") version "1.9.21"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "21"
}

tasks.withType<JavaCompile> {
    targetCompatibility = "21"
    sourceCompatibility = "21"
}

application {
    mainClass.set("MainKt")
}