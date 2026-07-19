FROM eclipse-temurin:17-jre
WORKDIR /app
EXPOSE 8080
ADD target/*.jar order-service.jar
ENTRYPOINT ["java", "-jar", "order-service.jar"]