#!/usr/bin/env bash

cd $(dirname "$0")

source ./init.sh

./shutdown.sh

APP_CONTEXT=simple-service-webapp

rm ${CATALINA_BASE}/webapps/${APP_CONTEXT}.war
rm -rf ${CATALINA_BASE}/webapps/${APP_CONTEXT}

pushd ../
    mvn clean package
    cp ./target/${APP_CONTEXT}.war ${CATALINA_BASE}/webapps/
popd

./startup.sh