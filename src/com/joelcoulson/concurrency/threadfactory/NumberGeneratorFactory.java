package com.joelcoulson.concurrency.threadfactory;

import java.util.concurrent.ThreadFactory;

public class NumberGeneratorFactory implements ThreadFactory {

    // we need to override the newThread
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        // set the priority
        thread.setPriority(Thread.MAX_PRIORITY);
        return thread;
    }
}
