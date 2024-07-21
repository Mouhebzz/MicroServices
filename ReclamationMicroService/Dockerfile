# Use the official OpenJDK base image
FROM openjdk:8-jre-slim

# Set the working directory
WORKDIR /app

# Copy the Spring Boot application JAR file into the container
COPY target/ReclamationMicroService-0.0.1-SNAPSHOT.jar reclamation-app.jar

# Expose the port that the application will run on
EXPOSE 8082

# Define the command to run the application when the container starts
CMD ["java", "-jar", "reclamation-app.jar"]