package com.joelcoulson.statics;

public class Counter {

    private static int counter;

    static {
        counter = 100;
    }

    public Counter() {
    }

    public void incrementCounter() {
        this.counter++;
    }

    public int getCounter() {
        return this.counter;
    }

}
