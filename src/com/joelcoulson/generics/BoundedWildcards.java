package com.joelcoulson.generics;

import java.util.ArrayList;

public class BoundedWildcards {

    // note the use of the <T> just after the public access modifier
    // this tells the compiler that the type shall be supplied at run time
    public <T> void sumAll (ArrayList<? extends Number> list) {
        Double sum = 0.0;
        for(Number value: list) {
            sum += value.doubleValue();
        }

        System.out.println("Sum: " + sum);
    }
}
