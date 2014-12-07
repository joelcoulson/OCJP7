package com.joelcoulson.concurrency.conditions;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Controller {

    public static void main(String[] args) {

        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();

        // create several trains with several people on those trains
        Train fremantle = new Train("Fremantle", new Person("Andy"), lock, condition);
        Train mandurah = new Train("Mandurah", new Person("Joel"), lock, condition);
        Train joondalup = new Train("Joondalup", new Person("Helene"), lock, condition);
        Train midland = new Train("Midland", new Person("Henry"), lock, condition);
        // create a taxi which shall wait for Joel's arrival
        Taxi taxi = new Taxi(lock, condition);

        fremantle.start();
        mandurah.start();
        joondalup.start();
        midland.start();
        taxi.start();
    }
}
