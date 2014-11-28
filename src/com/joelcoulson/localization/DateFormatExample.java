package com.joelcoulson.localization;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample {

    public static void main(String[] args) {
        Date date = new Date();
        DateFormat dateFormat;

        // basic date formats
        dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println("Short date: " + dateFormat.format(date));

        dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println("Long date: " + dateFormat.format(date));

        dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("Full date: " + dateFormat.format(date));

        // creating your own format
        String pattern = "dd-M-Y hh:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        System.out.println("Custom date: " +simpleDateFormat.format(date));
    }
}
