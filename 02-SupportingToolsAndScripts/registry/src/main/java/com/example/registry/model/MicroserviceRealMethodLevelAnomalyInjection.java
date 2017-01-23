package com.example.registry.model;

public class MicroserviceRealMethodLevelAnomalyInjection extends MicroserviceRealAnomalyInjection {
    private String serviceType;
    private String method;

    public MicroserviceRealMethodLevelAnomalyInjection() {};

    public MicroserviceRealMethodLevelAnomalyInjection(String serviceType, String method, long duration, int offset) {
        super(duration, offset);
        this.serviceType = serviceType;
        this.method = method;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public String getServiceType() {
        return this.serviceType;
    }

    @Override
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public String getKey() {
        return this.serviceType + ":" + this.method;
    }
}
