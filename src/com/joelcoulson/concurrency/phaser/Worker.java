package com.joelcoulson.concurrency.phaser;

import java.util.concurrent.Phaser;

public class Worker extends Thread {

    private String name;
    private Phaser phaser;

    public Worker(String name, Phaser phaser) {
        this.name = name;
        this.phaser = phaser;
    }

    public void run() {

        phaser.register();

        try {

            Thread.sleep(1000);

            for(int i = 1; i <=3; i++){
                // wait for all threads to be ready before starting
                phaser.arriveAndAwaitAdvance();

                // execute task
                System.out.println(name + " is executing task" + i);
                Thread.sleep((long) (Math.random() * 10000));
                System.out.println(name + " has completed task " + i);
            }
        } catch(InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
