package com.example.registry.model;

public class MicroserviceAnomalyInjection {
    protected AnomalyType anomalyType;
    protected boolean isInitial = false;

    public MicroserviceAnomalyInjection() {};

    public AnomalyType getAnomalyType() {
        return this.anomalyType;
    }

    public void setAnomalyType(AnomalyType anomalyType) {
        this.anomalyType = anomalyType;
    }

    public void printEvent() {
        System.out.println(System.nanoTime() + ";" + this.anomalyType.name());
    }

    public void setInitial() {
        this.isInitial = true;
    }
    public boolean isInitial() {
        return this.isInitial;
    }
}
