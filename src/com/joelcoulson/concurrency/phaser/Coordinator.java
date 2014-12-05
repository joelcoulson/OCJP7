package com.joelcoulson.concurrency.phaser;

import java.util.concurrent.Phaser;

public class Coordinator {

    public static void main(String[] args) {

        Phaser phaser = new Phaser();

        // send the same phaser to all workers
        Worker worker1 = new Worker("Worker1", phaser);
        Worker worker2 = new Worker("Worker2", phaser);
        Worker worker3 = new Worker("Worker3", phaser);

        worker1.start();
        worker2.start();
        worker3.start();
    }
}
