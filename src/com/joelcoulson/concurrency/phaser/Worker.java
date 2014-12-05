package com.joelcoulson.concurrency.phaser;

import java.util.concurrent.Phaser;

public class Worker extends Thread {

    private String name;
    private Phaser phaser;

    public Worker(String name, Phaser phaser) {
        this.name = name;
        this.phaser = phaser;
        // we need to register ourselves with the phaser
        phaser.register();
    }

    public void run() {
        try {

            for(int i = 1; i <= 3; i++) {
                if(i < 3) {
                    // arrive and wait for the other threads to be ready
                    phaser.arriveAndAwaitAdvance();
                } else {
                    // we've finished our tasks so deregister
                    phaser.arriveAndDeregister();
                }

                System.out.println(name + " is doing task " + i);
                //Thread.sleep((long) (Math.random() * 10000));
                System.out.println(name + " completed task " + i);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
