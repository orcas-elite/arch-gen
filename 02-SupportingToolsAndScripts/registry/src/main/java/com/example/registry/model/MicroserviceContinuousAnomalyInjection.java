package com.example.registry.model;

public class MicroserviceContinuousAnomalyInjection extends MicroserviceAnomalyInjection {
    private String serviceType;
    private String method;
    private int offset;

    public MicroserviceContinuousAnomalyInjection() {
        this.anomalyType = AnomalyType.CONTINUOUS;
    }

    public MicroserviceContinuousAnomalyInjection(String serviceType, String method, int offset) {
        this();
        this.setServiceType(serviceType);
        this.setMethod(method);
        this.setOffset(offset);
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}


