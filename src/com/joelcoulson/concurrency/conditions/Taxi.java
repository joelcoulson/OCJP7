package com.joelcoulson.concurrency.conditions;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Taxi extends Thread {

    private Lock lock;
    private Condition condition;

    public Taxi(Lock lock, Condition condition) {
        this.lock = lock;
        this.condition = condition;
    }

    public void run() {
        lock.lock();
        try {
            // lets wait for up to 60 seconds for Joel's train to arrive at the station
            if(condition.await(60, TimeUnit.SECONDS)) {
                System.out.println("Joel's arrived!!");
            } else {
                System.out.println("We waited, and Joel never arrived....");
            }
        } catch(InterruptedException ie) {
            ie.printStackTrace();
        } finally {
            // always remember to unlock
            lock.unlock();
        }
    }
}
