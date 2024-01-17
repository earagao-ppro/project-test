plugins {
	java
	id("org.springframework.boot") version "3.2.1"
	id("io.spring.dependency-management") version "1.1.4"
	id("org.sonarqube") version "4.4.1.3373"
}

group = "com.edipo.aragao"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
	useJUnitPlatform()
}

sonar {
	properties {
		property("sonar.projectKey", "earagao-ppro_project-test2")
		property("sonar.organization", "earagao-ppro")
		property("sonar.host.url", "https://sonarcloud.io")
	}
}