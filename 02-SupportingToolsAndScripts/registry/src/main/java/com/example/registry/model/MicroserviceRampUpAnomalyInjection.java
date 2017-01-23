package com.example.registry.model;

public class MicroserviceRampUpAnomalyInjection extends MicroserviceAnomalyInjection {

    private String serviceType;
    private long duration;
    private int offset;
    private int continuousOffset;

    public MicroserviceRampUpAnomalyInjection() {
        this.anomalyType = AnomalyType.RAMP_UP;
    }

    public MicroserviceRampUpAnomalyInjection(String serviceType, long duration, int offset) {
        this(serviceType, duration, offset, 0);
    }

    public MicroserviceRampUpAnomalyInjection(String serviceType, long duration, int offset, int continuousOffset) {
        this();
        this.setServiceType(serviceType);
        this.setDuration(duration);
        this.setOffset(offset);
        this.setContinuousOffset(continuousOffset);
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getContinuousOffset() {
        return this.continuousOffset;
    }

    public void setContinuousOffset(int offset) {
        this.continuousOffset = offset;
    }
}
