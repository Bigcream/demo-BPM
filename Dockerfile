# Sử dụng image Java 8 chính thức từ OpenJDK làm base image
FROM openjdk:8-jdk-slim

# Thiết lập thư mục làm việc trong container
WORKDIR /app

# Copy file JAR từ thư mục target/ vào container
COPY target/*.jar app.jar

# Expose port mặc định của Spring Boot (thay đổi nếu cần)
EXPOSE 8080

# Chạy ứng dụng Spring Boot khi container khởi động
ENTRYPOINT ["java", "-jar", "app.jar"]