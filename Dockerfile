FROM openjdk:11

COPY target/17-Spring_h2_Database-0.0.1-SNAPSHOT.war /app/17-Spring_h2_Database-0.0.1-SNAPSHOT.war

WORKDIR /app

ENTRYPOINT ["java", "-war", "17-Spring_h2_Database-0.0.1-SNAPSHOT.war" ]
