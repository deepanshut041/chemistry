# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=build/libs/chemistry-0.0.1.jar
ADD ${JAR_FILE} chemistry.jar
RUN sh -c 'touch /chemistry.jar'
ENV JAVA_OPTS="-Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8787,suspend=n"
EXPOSE 8080 8787
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=heroku -jar /chemistry.jar" ]
