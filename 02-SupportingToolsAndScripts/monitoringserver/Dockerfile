FROM java:openjdk-8

WORKDIR /opt

EXPOSE 22

ADD target/kieker-monitoring-server-0.0.1-jar-with-dependencies.jar /opt/monitoringserver.jar

RUN apt-get update && apt-get -y upgrade && apt-get install -y openssh-server
RUN sed -i "s%PermitRootLogin without-password%PermitRootLogin yes%g" /etc/ssh/sshd_config
RUN echo "root:toor" | chpasswd

CMD \
/etc/init.d/ssh start && \
java -Dorg.apache.activemq.SERIALIZABLE_PACKAGES=* -jar monitoringserver.jar
