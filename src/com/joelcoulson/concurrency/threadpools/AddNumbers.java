package com.joelcoulson.concurrency.threadpools;

import java.util.concurrent.Callable;

// implement callable interface with the generic of the type
// we're returning from the call method
public class AddNumbers implements Callable<Integer>{

    int a, b;

    public AddNumbers(int a, int b) throws Exception {
        this.a = a;
        this.b = b;
    }

    // implementing the call the method in order to get the result
    // from the thread
    public Integer call()  {
        return a+b;
    }
}
