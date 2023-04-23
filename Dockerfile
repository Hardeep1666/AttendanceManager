FROM openjdk:8
EXPOSE 8080
ADD target/RatingService.jar RatingService.jar
ENTRYPOINT ["java","-jar","/RatingService.jar"]


