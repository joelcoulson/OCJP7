package com.joelcoulson.threads;

/**
 * Created by Joel on 1/09/2014.
 */
public class ABTest {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        a.start();
        b.start();

    }
}
