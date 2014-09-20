package com.joelcoulson.threads;

/**
 * Created by Joel on 31/08/2014.
 */
public class Bomb extends Thread {

    public Bomb() {

    }

    public void run() {
        try {
            for(int i = 0; i < 10; i++) {
                System.out.println(i);
                sleep(1000);
            }
        } catch(InterruptedException ie) {
            ie.printStackTrace();
        }
    }

}
