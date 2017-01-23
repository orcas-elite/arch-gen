FROM java:openjdk-8

ADD testplan.jmx /opt/testplan.jmx

RUN \
  apt-get update && \
  apt-get install -y jmeter jmeter-http

CMD sleep 30 && jmeter -Jduration=600 -n -t /opt/testplan.jmx && sleep 300


