package com.joelcoulson.threads;

/**
 * Created by Joel on 31/08/2014.
 */
public class BombTest {

    public static void main(String[] args) {

        Bomb bomb = new Bomb();

        bomb.start();
        try {
            bomb.join(4000);
        } catch(InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("BOOM!");

    }

}
