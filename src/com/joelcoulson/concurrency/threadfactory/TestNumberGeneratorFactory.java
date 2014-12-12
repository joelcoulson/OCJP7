package com.joelcoulson.concurrency.threadfactory;

import java.util.concurrent.ThreadFactory;

public class TestNumberGeneratorFactory {

    public static void main(String[] args) {
        // run 3 threads

        ThreadFactory numberGeneratorFactory = new NumberGeneratorFactory();

        try {
            Thread thread1 = numberGeneratorFactory.newThread(new NumberGenerator());
            Thread thread2 = numberGeneratorFactory.newThread(new NumberGenerator());
            Thread thread3 = numberGeneratorFactory.newThread(new NumberGenerator());
            thread1.start();
            thread2.start();
            thread3.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
