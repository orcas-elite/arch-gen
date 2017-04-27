#!/usr/bin/env bash

CUR_DIR=`pwd`


SVC_ARRAY_STRING="jmeter registry monitoringserver jmsserver"

for genfolder in `ls -d gen-*`
do
  SVC_ARRAY_STRING="$genfolder $SVC_ARRAY_STRING"
done

SVC_ARRAY=( $SVC_ARRAY_STRING )

for SVC_FOLDER in ${SVC_ARRAY[*]}
do
  kubectl delete -f $SVC_FOLDER/kubernetes.yaml
  sleep 2
done
