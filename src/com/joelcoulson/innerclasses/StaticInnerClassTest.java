package com.joelcoulson.innerclasses;

public class StaticInnerClassTest {

    public static void main(String[] args) {

        StaticInnerClass outerClass = new StaticInnerClass();
        StaticInnerClass.Hello innerClass = new StaticInnerClass.Hello();

        outerClass.greeting();
        innerClass.greeting();
    }

}
