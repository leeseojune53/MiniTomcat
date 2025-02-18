plugins {
    id("java")
    id("com.diffplug.spotless") version "6.25.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

allprojects {
    apply(plugin = "com.diffplug.spotless")

    spotless {
        java {
            palantirJavaFormat()
        }
    }

}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}