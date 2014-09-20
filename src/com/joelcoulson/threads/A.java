package com.joelcoulson.threads;

/**
 * Created by Joel on 1/09/2014.
 */
public class A extends Thread {

    // used for shared locking
    public static Object lock = new Object();
    public static int counter = 0;

    public void run() {

        while(true) {
            try {
                synchronized (A.lock) {
                    if(counter < 5) {
                        counter++;
                        System.out.println("A: " + counter);
                        sleep(500);
                    } else {
                        A.lock.notifyAll();
                        A.lock.wait();
                    }
                }
            }catch(InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}
