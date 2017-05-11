#!/usr/bin/env bash
# Example script automating the build process of the generated services

CUR_DIR=`pwd`

cd gen-database
mvn clean package
cd $CUR_DIR

cd gen-logic
mvn clean package
cd $CUR_DIR

cd gen-portal
mvn clean package
cd $CUR_DIR

docker-compose up
