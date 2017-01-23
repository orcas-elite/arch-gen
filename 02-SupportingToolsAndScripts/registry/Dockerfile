FROM java:openjdk-8

EXPOSE 8080

COPY target/registry-1.0.0.jar /

CMD java -Dorg.apache.activemq.SERIALIZABLE_PACKAGES=* -jar registry-1.0.0.jar
