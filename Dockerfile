# Alpine Linux with OpenJDK JRE
FROM openjdk:8-jre-alpine

# copy JAR
COPY target/helloapi-0.0.1-SNAPSHOT.jar /helloapi.jar 

#Declare port
EXPOSE 8080

# run application with this command line 
CMD ["/usr/bin/java", "-jar", "-Dspring.profiles.active=default", "/helloapi.jar"]
