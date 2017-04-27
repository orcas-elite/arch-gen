#!/usr/bin/env bash

SVC_ARRAY_STRING="jmsserver monitoringserver registry"

for genfolder in `ls -d gen-*`
do
  SVC_ARRAY_STRING="$SVC_ARRAY_STRING $genfolder"
done

SVC_ARRAY_STRING="$SVC_ARRAY_STRING jmeter"

SVC_ARRAY=( $SVC_ARRAY_STRING )
echo ${SVC_ARRAY[*]}

function getPorts() {
  kubectl describe svc $1 | grep "^NodePort:" | cut -f 3,4 | cut -d'/' -f1
}

for SVC_FOLDER in ${SVC_ARRAY[*]} 
do
  SVC_NAME=`echo $SVC_FOLDER | cut -d'-' -f2`
  kubectl create -f ${SVC_FOLDER}/kubernetes.yaml
  sleep 3
  getPorts $SVC_NAME
  echo ""
done
