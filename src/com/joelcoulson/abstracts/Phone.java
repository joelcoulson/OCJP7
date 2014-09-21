package com.joelcoulson.abstracts;

import com.joelcoulson.interfaces.Describable;

// here we implement the Describable interface which then
// forces all classes implementing the Phone abstract class
// to also implement the describe() method found in Describable

public abstract class Phone implements Describable {

    public abstract void call(int number);
    public abstract void answer();

}
