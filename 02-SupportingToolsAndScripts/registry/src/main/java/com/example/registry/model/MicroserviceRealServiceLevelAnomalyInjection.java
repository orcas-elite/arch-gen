package com.example.registry.model;

public class MicroserviceRealServiceLevelAnomalyInjection extends MicroserviceRealAnomalyInjection {
    private String serviceType;

    public MicroserviceRealServiceLevelAnomalyInjection() {};

    public MicroserviceRealServiceLevelAnomalyInjection(String serviceType, long duration, int offset) {
        super(duration, offset);
        this.serviceType = serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public String getServiceType() {
        return this.serviceType;
    }

    @Override
    public String getKey() {
        return this.serviceType;
    }
}
