package com.joelcoulson.innerclasses;

public class LocalInnerClass {

    public void addTwo(int x, int y) {

        class Compute {
            public int computation(int x, int y) {
                return (x+y);
            }
        }

        Compute compute = new Compute();
        System.out.println("The result is: " + compute.computation(x, y));
    }

}
