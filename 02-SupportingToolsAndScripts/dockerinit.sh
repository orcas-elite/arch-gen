#!/usr/bin/env bash
# Example script automating the build process of the generated services
# including the creation of the Docker images

CUR_DIR=`pwd`

eval $(minikube docker-env)

cd jmsserver
docker build -t my/jmsserver .
cd $CUR_DIR

cd monitoringserver
mvn clean compile assembly:single
docker build -t my/monitoringserver .
cd $CUR_DIR

cd registry 
mvn clean package
docker build -t my/registry .
cd $CUR_DIR

cd gen-database
mvn clean package
docker build -t my/database .
cd $CUR_DIR

cd gen-logic
mvn clean package
docker build -t my/logic .
cd $CUR_DIR

cd gen-portal
mvn clean package
docker build -t my/portal .
cd $CUR_DIR

cd jmeter
docker build -t my/jmeter .
cd $CUR_DIR

#sudo docker-compose up
