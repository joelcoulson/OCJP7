package com.joelcoulson.concurrency.semaphores;

import java.util.concurrent.*;

public class Person extends Thread {

    private String name;
    private Semaphore semaphore;

    public Person(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
        this.start();
    }

    public void run() {

        try {
            // acquire the semaphore
            this.semaphore.acquire();

            // do something
            System.out.println(this.name + " has the lock!");
            int time = (int)(Math.random() * 1000);
            Thread.sleep(time);
            System.out.println(this.name + " worked for " + time + "ms!");

            // release the semaphore
            this.semaphore.release();

        } catch(InterruptedException ie) {
            ie.printStackTrace();
        }
    }

}
