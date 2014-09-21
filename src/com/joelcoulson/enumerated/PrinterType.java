package com.joelcoulson.enumerated;

public enum PrinterType {

    DOTMATRIX(5), BUBBLEJET(16), LASER(50);

    private int pagePrint;

    private PrinterType(int pagePrint) {
        this.pagePrint = pagePrint;
    }

    public int getPagePrint() {
        return this.pagePrint;
    }
}
