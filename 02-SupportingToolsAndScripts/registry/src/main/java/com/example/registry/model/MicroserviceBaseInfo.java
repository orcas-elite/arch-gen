package com.example.registry.model;

public class MicroserviceBaseInfo {

    protected String type;
    protected String uuid;

    public MicroserviceBaseInfo() {

    }

    public MicroserviceBaseInfo(String type, String uuid) {
        this.type = type;
        this.uuid = uuid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUuid() { return this.uuid;}

    public void setUuid(String uuid) { this.uuid = uuid; }
}
