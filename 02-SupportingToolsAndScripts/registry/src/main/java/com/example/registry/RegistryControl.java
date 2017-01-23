package com.example.registry;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.example.registry.model.*;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class RegistryControl implements ServiceApi, ControlApi {

    private static ConcurrentHashMap<String, Integer> rampUpDelay = new ConcurrentHashMap<>(); //based on type only
    private static ConcurrentHashMap<String, Integer> contChangeDelay = new ConcurrentHashMap<>(); // based on type and method
    private static ConcurrentHashMap<String, Integer> anomalyDelay = new ConcurrentHashMap<>(); // based on uuid and method
    private static ScheduledThreadPoolExecutor stpe = new ScheduledThreadPoolExecutor(10);
    private static Set registrationSet = Collections.synchronizedSet(new HashSet<String>());
    private static TreeMap<Long, String> injections = new TreeMap<>();

    class RampUpDelayDeleteTask implements Runnable {
        private final String key;
        private final int value;
        public RampUpDelayDeleteTask(String key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public void run() {
            rampUpDelay.computeIfPresent(this.key, (k,v) -> ((v - this.value)>=0)? (v - this.value) : 0);
            System.out.println("RampUpDelayDeleteTask: Removed delay (" + this.key + ":" + this.value + ")");
        }
    }

    class AnomalyDelayDeleteTask implements Runnable {
        private final String key;
        private final int value;
        public AnomalyDelayDeleteTask(String key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public void run() {
            anomalyDelay.computeIfPresent(this.key, (k,v) -> ((v - this.value)>=0)? (v - this.value) : 0);
            System.out.println("AnomalyDelayDeleteTask: Removed delay (" + this.key + ":" + this.value + ")");
        }
    }

    @Override
    @RequestMapping(value = "/register", method = GET)
    public String listRegistrations() {
        StringBuilder sb = new StringBuilder();
        sb.append("start --></br>" + System.lineSeparator());
        for(Object o : registrationSet.toArray()) {
            if(o instanceof String) {
                sb.append(String.valueOf(o) + "</br>" + System.lineSeparator());
            }
        }
        sb.append("<-- end" + System.lineSeparator());
        return sb.toString();
    }

    @Override
    @RequestMapping(value = "/injections", method = GET)
    public String listInjections() {
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Long, String> injectionEntry : injections.entrySet()) {
            sb.append(injectionEntry.getKey());
            sb.append(";");
            sb.append(injectionEntry.getValue());
            sb.append("<br/>" + System.lineSeparator());
        }

        return sb.toString();
    }


    @Override
    @RequestMapping(value = "/initAnomaly", method = POST)
    public void addInitializationAnomaly(
            @RequestBody MicroserviceRampUpAnomalyInjection anomalyInjection) {
        final long start = System.currentTimeMillis();
        final long end = start + anomalyInjection.getOffset();

        System.out.println("rampUpDelay {type: " + anomalyInjection.getServiceType() + ", duration: " + anomalyInjection.getDuration() + ", start: " + start + ", end: " + end + ", delay: " + anomalyInjection.getOffset() + ", contDelay: " + anomalyInjection.getContinuousOffset() + "}");
        if(!anomalyInjection.isInitial()) {
            if(anomalyInjection.getContinuousOffset() > 0) {
                injections.put(start, anomalyInjection.getServiceType() + "::" + AnomalyType.RAMP_UP_CONT.name());
            } else {
                injections.put(start, anomalyInjection.getServiceType() + "::" + AnomalyType.RAMP_UP.name());
            }
        }
        rampUpDelay.compute(anomalyInjection.getServiceType(), (k,v) -> (v == null)? anomalyInjection.getOffset() : v + anomalyInjection.getOffset());
        contChangeDelay.compute(anomalyInjection.getServiceType(), (k,v) -> (v== null)? anomalyInjection.getContinuousOffset() : v + anomalyInjection.getContinuousOffset());

        stpe.schedule(new RampUpDelayDeleteTask(anomalyInjection.getServiceType(), anomalyInjection.getOffset()), anomalyInjection.getDuration(), TimeUnit.MILLISECONDS);
    }

    @Override
    @RequestMapping(value = "/contAnomaly", method = POST)
    public void addContinuousAnomaly(
            @RequestBody MicroserviceContinuousAnomalyInjection anomalyInjection) {
        final long start = System.currentTimeMillis();
        final String key = anomalyInjection.getServiceType() + ":" + anomalyInjection.getMethod();
        if(!anomalyInjection.isInitial()) {
            injections.put(start, key + ":" + AnomalyType.CONTINUOUS.name());
        }
        Integer delay = contChangeDelay.compute(key, (k,v) -> (v == null)? anomalyInjection.getOffset() : (v + anomalyInjection.getOffset()));
        System.out.println("contChangeDelay {type: " + anomalyInjection.getServiceType() + ", method: " + anomalyInjection.getMethod() + ", start: " + start + ", delay: " + delay + "}");
    }

    @Override
    @RequestMapping(value = "/realServiceAnomaly", method = POST)
    public void addAnomaly(
            @RequestBody MicroserviceRealServiceLevelAnomalyInjection anomalyInjection) {

        String key = anomalyInjection.getKey();
        String type = "SVC";
        final long start = System.currentTimeMillis();
        final long end = start + anomalyInjection.getDuration();

        anomalyDelay.compute(key, (k,v) -> (v == null)? anomalyInjection.getOffset() : v + anomalyInjection.getOffset());
        System.out.println("anomalyDelay" + type +  " {type: " + anomalyInjection.getServiceType() + ", uuid: " + anomalyInjection.getUuid() + ", method: " + anomalyInjection.getMethod() + ", duration: " + anomalyInjection.getDuration() + ", start: " + start + ", end: " + end + ", delay: " + anomalyInjection.getOffset() + "}");

        stpe.schedule(new AnomalyDelayDeleteTask(key, anomalyInjection.getOffset()), anomalyInjection.getDuration(), TimeUnit.MILLISECONDS);
    }

    @Override
    @RequestMapping(value = "/realMethodAnomaly", method = POST)
    public void addAnomaly(
            @RequestBody MicroserviceRealMethodLevelAnomalyInjection anomalyInjection) {

            String key = anomalyInjection.getKey();
            String type = "MET";

        final long start = System.currentTimeMillis();
        final long end = start + anomalyInjection.getDuration();

        anomalyDelay.compute(key, (k,v) -> (v == null)? anomalyInjection.getOffset() : v + anomalyInjection.getOffset());
        System.out.println("anomalyDelay" + type + " {type: " + anomalyInjection.getServiceType() + ", uuid: " + anomalyInjection.getUuid() + ", method: " + anomalyInjection.getMethod() + ", duration: " + anomalyInjection.getDuration() + ", start: " + start + ", end: " + end + ", delay: " + anomalyInjection.getOffset() + "}");

        stpe.schedule(new AnomalyDelayDeleteTask(key, anomalyInjection.getOffset()), anomalyInjection.getDuration(), TimeUnit.MILLISECONDS);
    }

    @Override
    @RequestMapping(value = "/register", method = POST)
    public void register(
            @RequestBody MicroserviceRegistrationInfo registrationInfo) {
        for(String key : registrationInfo.toKeys()) {
            System.out.println("Registered: " + key);
            registrationSet.add(key);
        }
    }

    @Override
    @RequestMapping(value = "/delay", method = GET)
    public Integer getDelay(
            @RequestParam(value = "type") String serviceType,
            @RequestParam(value = "method") String method,
            @RequestParam(value = "uuid") String uuid) {
        int totalDelay = 0;
        totalDelay += rampUpDelay.getOrDefault(serviceType, 0);
        totalDelay += contChangeDelay.getOrDefault(serviceType + ":" + method, 0);
        totalDelay += contChangeDelay.getOrDefault(serviceType, 0);
        totalDelay += anomalyDelay.getOrDefault(uuid + ":" + method, 0);
        totalDelay += anomalyDelay.getOrDefault(serviceType + "::" + method, 0);
        totalDelay += anomalyDelay.getOrDefault(serviceType, 0);
        //System.out.println("Returned delay for " + serviceType + ":" + uuid + ":" + method + " => " + totalDelay);
        return totalDelay;
    }

    @Override
    @RequestMapping(value = "/reset", method = POST)
    public void resetAll() {
        rampUpDelay.clear();
        contChangeDelay.clear();
        anomalyDelay.clear();
        System.out.println("Reset all anomalies.");
    }
}
