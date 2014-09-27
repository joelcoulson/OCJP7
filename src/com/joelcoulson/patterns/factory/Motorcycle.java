package com.joelcoulson.patterns.factory;

public class Motorcycle extends Vehicle implements Controllable {
    public void accelerate() {
        System.out.println("Wheelstand!");
    }

    public void brake() {
        System.out.println("Stoppie!");
    }
}
