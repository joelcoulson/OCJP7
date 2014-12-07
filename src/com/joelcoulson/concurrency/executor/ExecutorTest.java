package com.joelcoulson.concurrency.executor;

public class ExecutorTest {

    public static void main(String[] args) {
        Runnable runnable = new Task();
        TaskExecutor taskExecutor = new TaskExecutor();
        taskExecutor.execute(runnable);
    }
}
