package com.joelcoulson.patterns.dao.example1;

public class DatabaseDAO implements VehicleDAO {

    public DatabaseDAO() {}

    public void insertVehicle(VehicleTransfer vehicle) {
        // database insert implementation goes here
        System.out.println("Inserting vehicle " + vehicle.getModelName() + " into the database");
    }

    public void findVehicle(String model) {
        // database search implementation goes here
        System.out.println("Searching for vehicle " + model + " in the database");
    }

    public void deleteVehicle(String model) {
        // database deletion implementation goes here
        System.out.println("Deleting vehicle " + model + " from the database");
    }
}
