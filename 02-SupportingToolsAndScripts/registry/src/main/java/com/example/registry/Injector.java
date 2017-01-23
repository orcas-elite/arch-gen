package com.example.registry;

import com.example.registry.model.*;
import org.springframework.web.client.RestTemplate;


public class Injector implements Runnable, ControlApi {

    private static final String BASE_URL = "http://127.0.0.1:8080";
    private static final String EVALUATION_SCENARIO = "SIMPLE";
    private RestTemplate restTemplate = new RestTemplate();

    @Override
    public void run() {
        System.out.println("Starting injection..");
        try {
            // Let the registry service start up
            Thread.sleep(10000);

            if(EVALUATION_SCENARIO.equals("SIMPLE")) {

                // Initial delay setup
                MicroserviceContinuousAnomalyInjection initialPortalGetIndex = new MicroserviceContinuousAnomalyInjection("portal", "getIndex", 10);
                initialPortalGetIndex.setInitial();

                MicroserviceContinuousAnomalyInjection initialPortalGetOrder = new MicroserviceContinuousAnomalyInjection("portal", "getOrder", 15);
                initialPortalGetOrder.setInitial();

                MicroserviceContinuousAnomalyInjection initialLogicDoLogin = new MicroserviceContinuousAnomalyInjection("logic", "doLogin", 30);
                initialLogicDoLogin.setInitial();

                MicroserviceContinuousAnomalyInjection initialLogicDoOrder = new MicroserviceContinuousAnomalyInjection("logic", "doOrder", 45);
                initialLogicDoOrder.setInitial();

                MicroserviceContinuousAnomalyInjection initialDatabaseValidateLogin = new MicroserviceContinuousAnomalyInjection("database", "validateLogin", 60);
                initialDatabaseValidateLogin.setInitial();

                MicroserviceContinuousAnomalyInjection initialDatabaseStoreOrder = new MicroserviceContinuousAnomalyInjection("database", "storeOrder", 100);
                initialDatabaseStoreOrder.setInitial();

                // ---

                Thread.sleep(60000);


                MicroserviceRealMethodLevelAnomalyInjection realPortalGetIndex = new MicroserviceRealMethodLevelAnomalyInjection("portal", "getIndex", 30000, 250);
                addAnomaly(realPortalGetIndex);

                Thread.sleep(60000);

                MicroserviceRampUpAnomalyInjection rampLogic = new MicroserviceRampUpAnomalyInjection("logic", 15000, 200);
                addInitializationAnomaly(rampLogic);

                Thread.sleep(30000);

                MicroserviceRampUpAnomalyInjection rmpcDatabase = new MicroserviceRampUpAnomalyInjection("database", 20000, 250, 100);
                addInitializationAnomaly(rmpcDatabase);

                Thread.sleep(50000);

                MicroserviceRealServiceLevelAnomalyInjection realLogicDoOrder = new MicroserviceRealServiceLevelAnomalyInjection("logic", 25000, 300);
                addAnomaly(realLogicDoOrder);

                Thread.sleep(40000);

                MicroserviceRampUpAnomalyInjection rmpcPortal = new MicroserviceRampUpAnomalyInjection("portal", 15000, 300, 30);
                addInitializationAnomaly(rmpcPortal);

                Thread.sleep(40000);

                MicroserviceRampUpAnomalyInjection rampDatabase = new MicroserviceRampUpAnomalyInjection("database", 20000, 150);
                addInitializationAnomaly(rampDatabase);

                Thread.sleep(40000);

                MicroserviceRealMethodLevelAnomalyInjection realPortalGetOrder = new MicroserviceRealMethodLevelAnomalyInjection("portal", "getOrder", 30000, 250);
                addAnomaly(realPortalGetOrder);

                Thread.sleep(100000);

                MicroserviceRampUpAnomalyInjection rmpcLogic = new MicroserviceRampUpAnomalyInjection("logic", 20000, 200, 50);
                addInitializationAnomaly(rmpcLogic);


            } else if(EVALUATION_SCENARIO.equals("CASSANDRA")) {

                // Initial delay setup
                MicroserviceContinuousAnomalyInjection initialElbGetIndex = new MicroserviceContinuousAnomalyInjection("elb", "getIndex", 10);
                initialElbGetIndex.setInitial();

                MicroserviceContinuousAnomalyInjection initialElbGetOrder = new MicroserviceContinuousAnomalyInjection("elb", "getOrder", 15);
                initialElbGetOrder.setInitial();

                MicroserviceContinuousAnomalyInjection initialProxyDoLogin = new MicroserviceContinuousAnomalyInjection("proxy", "getInstanceLogin", 30);
                initialProxyDoLogin.setInitial();

                MicroserviceContinuousAnomalyInjection initialProxyDoOrder = new MicroserviceContinuousAnomalyInjection("proxy", "getInstanceOrder", 45);
                initialProxyDoOrder.setInitial();

                MicroserviceContinuousAnomalyInjection initialAppAuthenticate = new MicroserviceContinuousAnomalyInjection("app", "authenticate", 60);
                initialAppAuthenticate.setInitial();

                MicroserviceContinuousAnomalyInjection initialAppProcessRequest = new MicroserviceContinuousAnomalyInjection("app", "processRequest", 100);
                initialAppProcessRequest.setInitial();

                MicroserviceContinuousAnomalyInjection initialRestDataRead = new MicroserviceContinuousAnomalyInjection("restdata", "read", 35);
                initialRestDataRead.setInitial();

                MicroserviceContinuousAnomalyInjection initialRestDataWrite = new MicroserviceContinuousAnomalyInjection("restdata", "write", 50);
                initialRestDataWrite.setInitial();

                MicroserviceContinuousAnomalyInjection initialCassandraReadData = new MicroserviceContinuousAnomalyInjection("cassandra", "readData", 30);
                initialCassandraReadData.setInitial();

                MicroserviceContinuousAnomalyInjection initialCassandraStoreData = new MicroserviceContinuousAnomalyInjection("restdata", "storeData", 65);
                initialCassandraStoreData.setInitial();


                // ---

                Thread.sleep(60000);

                MicroserviceRealServiceLevelAnomalyInjection realSvcProxy = new MicroserviceRealServiceLevelAnomalyInjection("proxy", 20000, 200);
                addAnomaly(realSvcProxy);

                Thread.sleep(30000);

                MicroserviceRampUpAnomalyInjection rmpcApp = new MicroserviceRampUpAnomalyInjection("app", 15000, 250, 50);
                addInitializationAnomaly(rmpcApp);

                Thread.sleep(30000);

                MicroserviceRampUpAnomalyInjection rmpCass = new MicroserviceRampUpAnomalyInjection("cassandra", 30000, 300);
                addInitializationAnomaly(rmpCass);

                Thread.sleep(60000);

                MicroserviceRealMethodLevelAnomalyInjection realMethodElbGetIndexOrder = new MicroserviceRealMethodLevelAnomalyInjection("elb", "getIndexOrder", 40000, 150);
                addAnomaly(realMethodElbGetIndexOrder);


                Thread.sleep(60000);

                MicroserviceRampUpAnomalyInjection rmpcRestData = new MicroserviceRampUpAnomalyInjection("restdata", 20000, 300, 30);
                addInitializationAnomaly(rmpcRestData);

                Thread.sleep(45000);

                MicroserviceRealMethodLevelAnomalyInjection realMethodAppProcessOrder = new MicroserviceRealMethodLevelAnomalyInjection("app", "processOrder", 45000, 400);
                addAnomaly(realMethodAppProcessOrder);

                Thread.sleep(60000);

                MicroserviceRampUpAnomalyInjection rmpElb = new MicroserviceRampUpAnomalyInjection("elb", 20000, 150);
                addInitializationAnomaly(rmpElb);

                Thread.sleep(45000);

                MicroserviceRampUpAnomalyInjection rmpcCass = new MicroserviceRampUpAnomalyInjection("cassandra", 30000, 250, 50);
                addInitializationAnomaly(rmpcCass);


                Thread.sleep(60000);


            }

            listInjections();
            Thread.sleep(5000);
            listRegistrations();


        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Done.");
    }

    @Override
    public String listRegistrations() {
        String response = "no response.";
        String retrievedString = restTemplate.getForObject(BASE_URL + "/register", String.class);

        if(null != retrievedString) {
            response = retrievedString;
        }
        return response;
    }

    @Override
    public String listInjections() {
        String response = "no response.";
        String retrievedString = restTemplate.getForObject(BASE_URL + "/injections", String.class);

        if(null != retrievedString) {
            response = retrievedString;
        }
        return response;
    }

    @Override
    public void addInitializationAnomaly(MicroserviceRampUpAnomalyInjection anomalyInjection) {
        restTemplate.postForObject(BASE_URL + "/initAnomaly", anomalyInjection, Object.class);
        anomalyInjection.printEvent();
    }

    @Override
    public void addContinuousAnomaly(MicroserviceContinuousAnomalyInjection anomalyInjection) {
        restTemplate.postForObject(BASE_URL + "/contAnomaly", anomalyInjection, Object.class);
        anomalyInjection.printEvent();
    }

    @Override
    public void addAnomaly(MicroserviceRealMethodLevelAnomalyInjection anomalyInjection) {
        restTemplate.postForObject(BASE_URL + "/realMethodAnomaly", anomalyInjection, Object.class);
        anomalyInjection.printEvent();
    }

    @Override
    public void addAnomaly(MicroserviceRealServiceLevelAnomalyInjection anomalyInjection) {
        restTemplate.postForObject(BASE_URL + "/realServiceAnomaly", anomalyInjection, Object.class);
        anomalyInjection.printEvent();
    }

    @Override
    public void resetAll() {
        restTemplate.postForObject(BASE_URL + "reset", null, Object.class);
    }
}