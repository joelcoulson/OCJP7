package com.joelcoulson.abstracts;

public class MobilePhone extends Phone {

    public void call(int number) {
        System.out.println("This mobile phone is calling " + number);
    }

    public void answer() {
        System.out.println("This mobile phone is answering a call");
    }

    public void description() {
        System.out.println("Im a mobile!");
    }
}
