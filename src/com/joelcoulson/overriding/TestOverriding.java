package com.joelcoulson.overriding;

/**
 * Created by joel on 31/08/14.
 */
public class TestOverriding {

    public static void main(String[] args) {
        Person person1 = new Person("Joel");
        Person person2 = new Person("Joel");

        if(person1.equals(person2)) {
            System.out.println("The objects are equal!");
        } else {
            System.out.println("The objects are not equal!");
        }
    }

}
