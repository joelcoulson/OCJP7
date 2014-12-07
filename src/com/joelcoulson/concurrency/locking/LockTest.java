package com.joelcoulson.concurrency.locking;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Person andy = new Person("Andy", lock);
        Person john = new Person("John", lock);
        andy.start();
        john.start();
    }
}
