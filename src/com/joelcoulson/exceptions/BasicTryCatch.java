package com.joelcoulson.exceptions;

public class BasicTryCatch {

    public static void main(String[] args) {

        String someString = "fifty";

        try {
            int number = Integer.parseInt(someString);
            System.out.println("Number was: " + number);
        } catch(NumberFormatException nfe) {
            System.out.println("Error was: " + nfe.getMessage());
        } catch(Exception e) {
            System.out.println("Error was: " + e.getMessage());
        }

    }

}
