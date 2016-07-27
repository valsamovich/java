FROM java:
RUN mvn clean package
ADD /target/java-technologies-*.jar java-technologies.jar
ENTRYPOINT ["java","-jar","java-technologies.jar"]