

plugins {
    id ("java")
    id ("org.springframework.boot") version ("3.4.3")
    id ("io.spring.dependency-management") version ("1.1.7")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
    implementation ("org.springframework.boot:spring-boot-starter-web")
    implementation ("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation ("mysql:mysql-connector-java:8.0.32")
    compileOnly ("org.projectlombok:lombok")
    developmentOnly ("org.springframework.boot:spring-boot-devtools")
    annotationProcessor ("org.projectlombok:lombok")
    testImplementation ("org.springframework.boot:spring-boot-starter-test")
    testRuntimeOnly ("org.junit.platform:junit-platform-launcher")
}



tasks.test {
    useJUnitPlatform()
}