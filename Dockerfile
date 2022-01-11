FROM openjdk:11
ADD target/custo-docker.jar custo-docker.jar
ENTRYPOINT ["java", "-jar","custo-docker.jar"]
EXPOSE 8080