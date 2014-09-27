package com.joelcoulson.patterns.singleton;

public class SingletonTest {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();

        singleton.sayHello();

    }

}
