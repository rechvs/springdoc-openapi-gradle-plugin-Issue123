import org.springdoc.openapi.gradle.plugin.OpenApiGeneratorTask

plugins {
  id("com.github.psxpaul.execfork") version "0.2.2"
  id("io.spring.dependency-management") version "1.1.3"
  id("java")
  id("org.springdoc.openapi-gradle-plugin") version "1.7.0"
  id("org.springframework.boot") version "2.7.14"
}

group = "org.rechvs"
version = "0.0.0"

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.springframework.boot:spring-boot-starter-web")
  implementation("org.springdoc:springdoc-openapi-ui:1.7.0")
}

tasks {
  test {
    useJUnitPlatform()
  }
  withType(OpenApiGeneratorTask::class.java) {
    dependsOn(clean)
  }
}

openApi {
  outputDir = projectDir.resolve("openapi")
  outputFileName = "my-openapi.json"
}
