package com.joelcoulson.threads;

/**
 * Created by joel on 31/08/14.
 */
public class ExtendingThread extends Thread {

    private int number;

    public ExtendingThread(int number) {
        this.number = number;
    }

    // override the Threads' run() method
    public void run() {
        try {
            sleep((int) (Math.random() * 1000));
            System.out.println("Hi, I'm thread number: " + number);
        } catch(InterruptedException ie) {
            ie.printStackTrace();
        }
    }

}
