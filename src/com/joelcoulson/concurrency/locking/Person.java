package com.joelcoulson.concurrency.locking;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

public class Person extends Thread {

    private String name;
    private Lock lock;

    public Person(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
    }

    public String getPersonName() {
        return name;
    }

    public void run() {

        try {
            // try and acquire the lock for 10 seconds before giving up
            if(lock.tryLock(10, TimeUnit.SECONDS)) {

                // lock was acquired. lets keep it for a few seconds
                System.out.println(name + " is using the phone");
                sleep((long)(Math.random()*1000));
                System.out.println(name + " is finished with the phone");

            } else {
                System.out.println(name + " couldn't access phone");
            }
        } catch(InterruptedException ie) {
        } finally {
            // always unlock
            lock.unlock();
        }

    }
}
