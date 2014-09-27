package com.joelcoulson.patterns.dao;

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

    public VehicleTransfer getTransferObject() {
        // create and populate a new transfer object with this objects attributes
        VehicleTransfer transfer = new VehicleTransfer();
        transfer.setModelName(this.modelName);
        transfer.setEngineEngineSize(this.engineSize);
        return transfer;
    }
}
