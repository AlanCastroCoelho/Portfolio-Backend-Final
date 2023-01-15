FROM amazoncorretto:11-alpine-jdk //de que imagen partimos
MAINTAINER ALANCOELHO //quien es el dueño
COPY  target/BackEnd-0.0.1-SNAPSHOT   portfolio-alancoelho.jar       //va a copiar el empaquetado a github
ENTRYPOINT ["java","-jar", "/portfolio-alancoelho.jar"] // es la intstruccion que se va a ejecutar primero