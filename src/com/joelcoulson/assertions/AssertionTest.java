package com.joelcoulson.assertions;

public class AssertionTest {

    public static void main(String[] args) {
        int number = 100;
        assert(number < 50): "The number: " + number + " was greater than 50";
    }

}
