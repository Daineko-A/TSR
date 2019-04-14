import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.21"
    application
}

group = "by.ploskiy"
version = "1.0-SNAPSHOT"

val ktor_version = "1.1.3"
val kotlin_version = "1.3.21"
val exposed_version = "0.13.6"
val hikari_version = "2.7.1"

application {
    mainClassName = "io.ktor.server.netty.EngineMain"
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    compile("org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlin_version")
    compile("io.ktor:ktor-server-netty:$ktor_version")
    compile("io.ktor:ktor-auth:$ktor_version")
    compile("io.ktor:ktor-jackson:$ktor_version")
    compile("org.jetbrains.exposed:exposed:$exposed_version")
    compile("org.xerial:sqlite-jdbc:3.27.2.1")
    compile("com.zaxxer:HikariCP:$hikari_version")
    compile("ch.qos.logback:logback-classic:1.2.1")
    testImplementation("junit:junit:4.12")
    testCompile ("org.jboss.shrinkwrap:shrinkwrap-impl-base:1.2.6")
    testCompile ("org.jboss.arquillian.junit:arquillian-junit-container:1.4.1.Final")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}