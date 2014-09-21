package com.joelcoulson.abstracts;

public class PhoneTest {

    public static void main(String args[]) {

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
