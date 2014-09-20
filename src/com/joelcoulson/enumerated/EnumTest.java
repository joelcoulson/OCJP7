package com.joelcoulson.enumerated;

public class EnumTest {

    public static void main(String[] args) {

        // create a new enum
        PrinterType printerType = PrinterType.BUBBLEJET;

        System.out.println("The bubble jet can print " + PrinterType.BUBBLEJET.getPagePrint() + " pages per minute");
    }

}
