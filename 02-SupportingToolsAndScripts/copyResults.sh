#!/usr/bin/env bash
# scp wrapper script for copying the monitoring data from the monitoringserver microservice

IP_ADDR="$1"
PORT="$2"
TARGET_DIR="$3"
scp -r -P ${PORT} -o "UserKnownHostsFile=/dev/null" -o "StrictHostKeyChecking=no" root@${IP_ADDR}:/tmp/kieker*  ${TARGET_DIR}/.
