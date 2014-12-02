package com.joelcoulson.concurrency.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Player extends Thread {

    private CyclicBarrier cyclicBarrier;
    private String name;

    public Player(CyclicBarrier cyclicBarrier, String name) {
        this.cyclicBarrier = cyclicBarrier;
        this.name = name;
    }

    public void run() {
        try {
            // sleep for a random time
            Thread.sleep((int) (Math.random() * 10000));

            // waits until all parties have invoked await on this barrier before continuing
            System.out.println("Player " + this.name + " is now ready");
            cyclicBarrier.await();
        } catch(BrokenBarrierException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
