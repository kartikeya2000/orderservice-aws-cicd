FROM openjdk:17
WORKDIR /app
EXPOSE 8080
ADD target/*.jar order-service.jar
ENTRYPOINT ["java", "-jar", "order-sevice.jar"]