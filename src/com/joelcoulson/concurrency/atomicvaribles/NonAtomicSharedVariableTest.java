package com.joelcoulson.concurrency.atomicvaribles;

public class NonAtomicSharedVariableTest {
    public static void main(String[] args) {
        NonAtomicSharedVariable nonAtomicSharedVariable1 = new NonAtomicSharedVariable();
        NonAtomicSharedVariable nonAtomicSharedVariable2 = new NonAtomicSharedVariable();
        nonAtomicSharedVariable1.start();
        nonAtomicSharedVariable2.start();
    }
}