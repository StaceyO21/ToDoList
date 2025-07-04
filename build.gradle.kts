

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
    implementation ("org.springframework.boot:spring-boot-starter-web")
    implementation ("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation ("mysql:mysql-connector-java:8.0.32")
    compileOnly ("org.projectlombok:lombok")
    developmentOnly ("org.springframework.boot:spring-boot-devtools")
    annotationProcessor ("org.projectlombok:lombok")
    testImplementation ("org.springframework.boot:spring-boot-starter-test")
    testRuntimeOnly ("org.junit.platform:junit-platform-launcher")
    implementation ("org.springframework.boot:spring-boot-starter-validation")

    implementation ("org.springframework.boot:spring-boot-starter-oauth2-client")
    implementation ("org.springframework.boot:spring-boot-starter-security")
    implementation ("org.springframework.security:spring-security-oauth2-resource-server")
    implementation ("org.springframework.security:spring-security-oauth2-jose")
    implementation ("com.auth0:java-jwt:4.2.1")

    implementation("org.springframework.security:spring-security-crypto:5.5.1")

}



tasks.test {
    useJUnitPlatform()
}