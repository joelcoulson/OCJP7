package com.joelcoulson.concurrency.atomicvaribles;

public class NonAtomicSharedVariable extends Thread {

    private static int counter;

    public NonAtomicSharedVariable() {
        counter = 0;
    }

    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                counter++;
                Thread.sleep(50);
            }
        } catch(InterruptedException ie) {}

        System.out.println("Counter: " + counter);
    }
}
