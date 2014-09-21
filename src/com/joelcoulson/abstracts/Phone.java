package com.joelcoulson.abstracts;

import com.joelcoulson.interfaces.Describable;

public abstract class Phone implements Describable {

    public abstract void call(int number);
    public abstract void answer();

}
