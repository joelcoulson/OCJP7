package com.joelcoulson.exceptions;

public class EngineException extends Exception {

    public EngineException() {
        super();
    }

    public EngineException(String s) {
        super(s);
        System.out.println("Kaboom!");
    }

}
