package com.example.registry;

import com.example.registry.model.MicroserviceRegistrationInfo;

public interface ServiceApi {
    public void register(MicroserviceRegistrationInfo registrationInfo);
    public Integer  getDelay(String serviceType, String method, String uuid);
}
