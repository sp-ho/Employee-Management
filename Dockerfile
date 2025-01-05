FROM openjdk:17
EXPOSE 8080
ADD target/Employee-Management-0.0.1-SNAPSHOT.jar spring-app.jar
ENTRYPOINT ["java", "-jar", "spring-app.jar"]