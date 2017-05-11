FROM java:openjdk-8

EXPOSE 8080

COPY target/portal-1.0.0.jar /

CMD java -Dorg.apache.activemq.SERIALIZABLE_PACKAGES=* -jar portal-1.0.0.jar
