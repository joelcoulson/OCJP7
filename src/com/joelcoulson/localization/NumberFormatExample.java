package com.joelcoulson.localization;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatExample {

    public static void main(String[] args) {

        long tenMillion = 10000000;

        // formatting a number
        NumberFormat germanFormat = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(germanFormat.format(tenMillion));

        // showing the currency
        System.out.println(germanFormat.getCurrency());

        // formatting the currency
        System.out.println(germanFormat.getCurrencyInstance(Locale.GERMANY).format(tenMillion));

    }
}
