package com.joelcoulson.innerclasses;

// this is the outer class
public class StaticInnerClass {

    // this is the inner class
    public static class Hello  {
        public void greeting() {
            System.out.println("I'm the inner class! Hi!");
        }
    }

    public void greeting() {
        System.out.println("Im the outer class! Hi!");
    }

}
