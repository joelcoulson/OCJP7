package com.joelcoulson.patterns.singleton;

public class Singleton {

    private static Singleton singleton;

    // private constructor to ensure that new instances cannot be created outside of this class
    private Singleton() {
    }

    // declared static in order to be accessible from the class level (no instance required)
    public static Singleton getInstance() {

        // instantiate the Singleton instance if it hasnt already been
        // ensure that this is synchronized to prevent race conditions in threaded applications
        synchronized (Singleton.class) {
            if(singleton == null) {
                singleton = new Singleton();
            }
        }

        return singleton;
    }

    public void sayHello() {
        System.out.println("Hi there!");
    }

}
