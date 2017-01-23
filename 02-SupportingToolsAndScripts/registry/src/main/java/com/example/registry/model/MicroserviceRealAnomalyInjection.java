package com.example.registry.model;

public class MicroserviceRealAnomalyInjection extends MicroserviceAnomalyInjection {

    private long duration;
    private int offset;

    public MicroserviceRealAnomalyInjection() {}

    public MicroserviceRealAnomalyInjection(long duration, int offset) {
        this.anomalyType = AnomalyType.REAL;
        this.duration = duration;
        this.offset = offset;
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

    public String getUuid() {
        return "";
    }

    public String getMethod() {
        return "";
    }

    public String getServiceType() {
        return "";
    }

    public String getKey() {
        return "";
    }
}
