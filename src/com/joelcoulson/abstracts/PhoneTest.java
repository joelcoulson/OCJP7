package com.joelcoulson.abstracts;

public class PhoneTest {

    public static void main(String args[]) {

        // here we create new LandLinePhone and MobilePhone objects
        // using Phone references. we will use runtime polymorphism
        // to determine which objects are to be used in the local
        // call, answer and description classes

        Phone landline = new LandLinePhone();
        Phone mobile = new MobilePhone();

        call(landline);
        answer(landline);
        description(landline);

        call(mobile);
        answer(mobile);
        description(mobile);
    }

    public static void call(Phone phone) {
        phone.call(12345678);
    }

    public static void answer(Phone phone) {
        phone.answer();
    }

    public static void description(Phone phone) {
        phone.description();
    }

}
