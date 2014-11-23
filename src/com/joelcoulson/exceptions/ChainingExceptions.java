package com.joelcoulson.exceptions;

public class ChainingExceptions {

    public static void main(String[] args) {
        try {
            testException();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void testException() throws Exception {

        int numbers[] = new int[2];

        try {
            int number = numbers[100];
        } catch(ArrayIndexOutOfBoundsException oob) {
            // the chained exception catches the oob and then immediately
            // throws a new exception to the calling method
            throw new Exception("Oh no!");
        }
    }
}
