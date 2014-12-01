package com.joelcoulson.concurrency.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Person extends Thread {

    private String name;
    private CountDownLatch countDownLatch;

    public Person(String name, CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
        this.name = name;
        this.start();
    }

    public void run() {

        try {
            System.out.println(name + " is ready to start the race");

            // wait for the timer to reach 0
            countDownLatch.await();

        } catch(InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println(name + " is off and running!");
    }
}

