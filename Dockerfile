# Giai đoạn build
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /chat-service
COPY .mvn/ .mvn
COPY pom.xml ./
COPY src ./src
RUN mvn clean install -DskipTests

# Giai đoạn runtime
FROM openjdk:17-jdk-slim
WORKDIR /chat-service
COPY --from=build /chat-service/target/*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]