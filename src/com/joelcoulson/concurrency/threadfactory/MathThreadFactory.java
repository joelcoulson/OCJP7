package com.joelcoulson.concurrency.threadfactory;

import java.util.concurrent.ThreadFactory;

public class MathThreadFactory implements ThreadFactory{

    // override the newThread method
    // this will return a new AddNumber thread when called
    public Thread newThread(Runnable r) {
        return new Thread(r);
    }
}
