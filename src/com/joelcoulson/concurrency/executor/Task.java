package com.joelcoulson.concurrency.executor;

public class Task implements Runnable {
    // we need to override run to satisfy the interface
    public void run() {
        System.out.println("Running a task");
    }
}
