package com.joelcoulson.patterns.dao.example1;

public interface VehicleDAO {
    public void insertVehicle(VehicleTransfer vehicle);
    public void findVehicle(String model);
    public void deleteVehicle(String model);
}
