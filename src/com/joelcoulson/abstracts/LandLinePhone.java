package com.joelcoulson.abstracts;

public class LandLinePhone extends Phone {

    public void call(int number) {
        System.out.println("This landline is calling " + number);
    }

    public void answer() {
        System.out.println("This landline is answering a call");
    }

    public void description() {
        System.out.println("Im a landline!");
    }

}
