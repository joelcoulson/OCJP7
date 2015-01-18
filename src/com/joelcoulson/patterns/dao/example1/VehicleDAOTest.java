package com.joelcoulson.patterns.dao.example1;

public class VehicleDAOTest {

    public static void main(String args[]) {

        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle();
        Vehicle vehicle3 = new Vehicle();

        vehicle1.setModelName("Accord");
        vehicle2.setModelName("Civic");
        vehicle2.setModelName("Jazz");

        DatabaseDAO database = new DatabaseDAO();

        // we send the transfer objects to the database, not the original data object
        // the transfer object effectively forms the 'glue' in between a datasource like an
        // sql database and the objects attributes, thus it will not often be a one to one
        // mapping of attributes such as it is in this example
        database.insertVehicle(vehicle1.getTransferObject());
        database.insertVehicle(vehicle2.getTransferObject());
        database.insertVehicle(vehicle3.getTransferObject());

    }

}
