package com.joelcoulson.io;

import java.io.Console;

public class BasicConsole {

    public static void main(String[] args) {
        // the following gets a console from the system
        Console console = System.console();

        if(console != null) {
            String name = console.readLine("Please enter your name: ");
            console.printf("Pleased to meet you " + name);
        }
    }
}
