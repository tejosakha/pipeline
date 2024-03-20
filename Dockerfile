# Use an OpenJDK base image
FROM openjdk:17

# Copy the packaged JAR file into the container
ADD target/docker-integration.jar docker-integration.jar

# Expose the port that your application runs on
EXPOSE 8080

# Specify the command to run your application
CMD ["java", "-jar", "docker-integration.jar"]
