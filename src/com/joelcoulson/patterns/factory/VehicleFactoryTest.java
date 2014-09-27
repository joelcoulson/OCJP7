package com.joelcoulson.patterns.factory;

public class VehicleFactoryTest {
    public static void main(String[] args) {

        Vehicle vehicle = VehicleFactory.getVehicle(VehicleType.MOTORCYCLE);

        vehicle.setModelName("CBR600RR");
        vehicle.setEngineEngineSize(600);

        // use the interface to polymorphically determine the correct behavior
        System.out.println("Vehical is a " + vehicle.getModelName() + " with an engine size of " + vehicle.getEngineSize());
        ((Controllable)vehicle).accelerate();
        ((Controllable)vehicle).brake();
    }
}
