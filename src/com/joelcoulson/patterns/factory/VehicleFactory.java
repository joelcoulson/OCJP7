package com.joelcoulson.patterns.factory;

public class VehicleFactory {

    public VehicleFactory() {
    }

    public static Vehicle getVehicle(VehicleType vehicleType) {
        // return the type of vehicle based upon the vehicle type selected
        switch(vehicleType) {
            case CAR:
                return new Car();
            case MOTORCYCLE:
                return new Motorcycle();
            default:
                return null;
        }
    }
}
