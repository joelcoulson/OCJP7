package com.joelcoulson.concurrency.threadfactory;

import java.util.concurrent.Callable;

// implement callable interface with the generic of the type
// we're returning from the call method
public class AddNumbers implements Callable<Integer>{

    int a, b;

    public AddNumbers() throws Exception {
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    // implementing the call the method in order to get the result
    // from the thread
    public Integer call()  {
        return a+b;
    }
}
