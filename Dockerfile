FROM amazoncorretto:11-alpine-jdk
MAINTAINER ALANCOELHO
COPY  target/BackEnd-0.0.1-SNAPSHOT   portfolio-alancoelho.jar
ENTRYPOINT ["java","-jar", "/portfolio-alancoelho.jar"]