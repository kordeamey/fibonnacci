# Use an official Java runtime as a parent image
FROM openjdk:latest

# Set working directory in container
WORKDIR /app

# Copy Java source in container
COPY .   /app/Fibonacci

# Compile Java code
RUN javac Fibonacci.java

# Run Java application
CMD ["java", "Fibonacci"]