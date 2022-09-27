FROM openjdk:17
ADD target/MSA-6-reattempt-0.0.1-SNAPSHOT.jar MSA-6-reattempt-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "MSA-6-reattempt-0.0.1-SNAPSHOT.jar"]