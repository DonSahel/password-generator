# syntax=docker/dockerfile:1

FROM eclipse-temurin:17
WORKDIR /app
COPY password-generator/target/password-generator-0.0.1-SNAPSHOT.jar app/application.jar
CMD ["java", "-jar", "application.jar"]