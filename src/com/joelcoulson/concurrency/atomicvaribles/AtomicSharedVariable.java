package com.joelcoulson.concurrency.atomicvaribles;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicSharedVariable extends Thread {

    private static AtomicInteger counter = new AtomicInteger();

    public AtomicSharedVariable() {
        if(counter == null) {counter = new AtomicInteger();}
        counter.set(0);
    }

    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                counter.getAndIncrement();
                Thread.sleep(50);
            }
        } catch(InterruptedException ie) {}

        System.out.println("Counter: " + counter);
    }
}
