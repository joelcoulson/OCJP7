package com.joelcoulson.threads;

/**
 * Created by joel on 31/08/14.
 */
public class TestImplementingRunnable {

    public static void main(String[] args) {

        ExtendingThread one, two, three;
        one = new ExtendingThread(1);
        two = new ExtendingThread(2);
        three = new ExtendingThread(3);

        one.start();
        two.start();
        three.start();
    }

}
