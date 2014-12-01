package com.joelcoulson.concurrency.semaphores;

import java.util.concurrent.Semaphore;

public class Person extends Thread {

    private String name;
    private Semaphore semaphore;

    public Person(String name, Semaphore semaphore) {
        this.semaphore = semaphore;
        this.name = name;
        this.start();
    }

    public void run() {

        try {
            System.out.println(name + " is waiting to use the resource");

            // attempt to acquire a lock and use the resource. execution will sit
            // here and wait if the resource is already in use
            semaphore.acquire();

            System.out.println(name + " is accessing the resource");
            Thread.sleep(5000);
            System.out.println(name + " is done using the resource");

            // release the lock
            semaphore.release();

        } catch(InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
