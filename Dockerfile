 FROM openjdk:8
    ADD target/java-RatingService.jar java-RatingService.jar
    ENTRYPOINT ["java", "-jar","java-RatingService.jar"]
    EXPOSE 8080
    ENTRYPOINT["java", "-jar","/RatingService.jar"]