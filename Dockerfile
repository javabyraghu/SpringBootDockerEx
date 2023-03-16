FROM adoptopenjdk/openjdk11:latest
EXPOSE 8080
ADD target/SpringBootDockerEx-1.0.jar SpringBootDockerEx-1.0.jar
ENTRYPOINT ["java","-jar","/SpringBootDockerEx-1.0.jar"]
