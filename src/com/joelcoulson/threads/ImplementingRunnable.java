package com.joelcoulson.threads;

public class ImplementingRunnable {

    private int number;

    public ImplementingRunnable (int number) {
        this.number = number;
    }

    // override the Threads' run() method
    public void run() {
        System.out.println("Hi, I'm thread number: " + number);
    }

}
