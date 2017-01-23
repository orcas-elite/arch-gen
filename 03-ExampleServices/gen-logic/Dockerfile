FROM java:openjdk-8

EXPOSE 8080

COPY target/logic-1.2.5.jar /

CMD java -Dorg.apache.activemq.SERIALIZABLE_PACKAGES=* -jar logic-1.2.5.jar
