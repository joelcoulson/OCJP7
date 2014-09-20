package com.joelcoulson.innerclasses;

class Hello  {
    public void sayHello() {
        System.out.println("Hi there!");
    }
}

public class AnonymousInnerClass {

    public void sayHello() {

        // the anonymous inner class
        Hello pInstance = new Hello() {
            public void sayHello() {
                System.out.println("Anonymous hi there!");
            }
        };

    }

}
