FROM java:openjdk-8

EXPOSE 8080

COPY target/database-2.1.7.jar /

CMD java -Dorg.apache.activemq.SERIALIZABLE_PACKAGES=* -jar database-2.1.7.jar
