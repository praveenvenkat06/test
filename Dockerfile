FROM openjdk:19
EXPOSE 8080
ADD target/workflowSpringProject-0.0.1-SNAPSHOT.jar spring.jar
ENTRYPOINT ["java", "-jar", "spring.jar"]