package com.joelcoulson.patterns.factory;

public class Car extends Vehicle implements Controllable {
    public void accelerate() {
        System.out.println("Rear wheels spin!");
    }

    public void brake() {
        System.out.println("ABS activated!");
    }
}
