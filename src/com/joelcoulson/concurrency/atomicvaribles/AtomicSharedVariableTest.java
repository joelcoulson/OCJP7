package com.joelcoulson.concurrency.atomicvaribles;

public class AtomicSharedVariableTest {
    public static void main(String[] args) {
        AtomicSharedVariable atomicSharedVariable1 = new AtomicSharedVariable();
        AtomicSharedVariable atomicSharedVariable2 = new AtomicSharedVariable();
        atomicSharedVariable1.start();
        atomicSharedVariable2.start();
    }
}
