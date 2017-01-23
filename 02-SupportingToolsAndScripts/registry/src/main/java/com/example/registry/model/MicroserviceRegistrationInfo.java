package com.example.registry.model;

import java.util.ArrayList;
import java.util.List;

public class MicroserviceRegistrationInfo extends MicroserviceBaseInfo{

    private List<String> methods;

    public MicroserviceRegistrationInfo()
    {}

    public MicroserviceRegistrationInfo(String type, String uuid, List<String> methods) {
        super(type,uuid);
        this.methods = methods;
    }

    public List<String> getMethods() {
        return methods;
    }

    public void setMethods(List<String> methodList) {
        this.methods = methodList;
    }


    public List<String> toKeys() {
        List<String> result = new ArrayList<>();
        for(String method : methods) {
            result.add(this.type + ":" + this.uuid + ":" + method);
        }
        return result;
    }
}
