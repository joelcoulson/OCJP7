package com.joelcoulson.threads;

/**
 * Created by Joel on 1/09/2014.
 */
public class B extends Thread {

    public void run() {
        while(true) {

            try {

                synchronized (A.lock) {
                    // causes this thread to wait until the other sends us a notify
                    //A.lock.wait();
                    System.out.println("B");
                    A.counter = 0;
                    A.lock.notifyAll();
                    A.lock.wait();
                }

            }catch(InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}
