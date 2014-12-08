package com.joelcoulson.concurrency.threadfactory;

public class NumberGenerator implements Runnable {

    public void run() {
        try {
            Thread.sleep((long)(Math.random()*10000));
            System.out.println(Math.random() * 1000);
        } catch(InterruptedException ie) {
            ie.printStackTrace();
        }
    }

}
