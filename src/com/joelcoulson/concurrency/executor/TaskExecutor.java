package com.joelcoulson.concurrency.executor;

import java.util.concurrent.Executor;

public class TaskExecutor implements Executor {

    // we need to override the execute method
    public void execute(Runnable runnable) {
        // the executor creates the thread and starts it
        new Thread(runnable).start();
    }
}
