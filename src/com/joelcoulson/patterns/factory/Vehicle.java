package com.joelcoulson.patterns.factory;

public class Vehicle {
    private String modelName;
    private int engineSize;

    public void setModelName(String name) {
        this.modelName = name;
    }

    public String getModelName() {
        return this.modelName;
    }

    public void setEngineEngineSize(int size) {
        this.engineSize = size;
    }

    public int getEngineSize() {
        return this.engineSize;
    }
}
