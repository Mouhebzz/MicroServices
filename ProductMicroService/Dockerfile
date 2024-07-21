# Use the official OpenJDK base image
FROM openjdk:8-jre-slim

# Set the working directory
WORKDIR /app

# Copy the Spring Boot application JAR file into the container
COPY target/ProductMicroService-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that the application will run on
EXPOSE 8080

# Define the command to run the application when the container starts
CMD ["java", "-jar", "app.jar"]