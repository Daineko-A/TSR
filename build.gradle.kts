import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.21"
    application
}

group = "by.ploskiy"
version = "1.0-SNAPSHOT"

val ktor_version = "1.1.3"

application {
    mainClassName = "io.ktor.server.netty.EngineMain"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    compile("io.ktor:ktor-server-netty:$ktor_version")
    testImplementation("junit:junit:4.12")
    testCompile ("org.jboss.shrinkwrap:shrinkwrap-impl-base:1.2.6")
    testCompile ("org.jboss.arquillian.junit:arquillian-junit-container:1.4.1.Final")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}