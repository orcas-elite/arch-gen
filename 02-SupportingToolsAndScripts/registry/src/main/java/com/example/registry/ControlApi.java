package com.example.registry;

import com.example.registry.model.*;

public interface ControlApi {
    public String listRegistrations();
    public String listInjections();
    public void addInitializationAnomaly(MicroserviceRampUpAnomalyInjection anomalyInjection);
    public void addContinuousAnomaly(MicroserviceContinuousAnomalyInjection anomalyInjection);
    public void addAnomaly(MicroserviceRealMethodLevelAnomalyInjection anomalyInjection);
    public void addAnomaly(MicroserviceRealServiceLevelAnomalyInjection anomalyInjection);
    public void resetAll();
}
