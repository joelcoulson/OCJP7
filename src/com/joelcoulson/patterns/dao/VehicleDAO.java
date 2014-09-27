package com.joelcoulson.patterns.dao;

public interface VehicleDAO {
    public void insertVehicle(VehicleTransfer vehicle);
    public void findVehicle(String model);
    public void deleteVehicle(String model);
}
