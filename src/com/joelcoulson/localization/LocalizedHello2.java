package com.joelcoulson.localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizedHello2 {

    public static void main(String[] args) {
        Locale currentLocale = Locale.getDefault();
        ResourceBundle resourceBundle;

        // using the english resource file
        resourceBundle = ResourceBundle.getBundle("Greetings_en", currentLocale);
        System.out.println(resourceBundle.getString("Formal"));
        System.out.println(resourceBundle.getString("Casual"));

        // using the french resource file
        resourceBundle = ResourceBundle.getBundle("Greetings_fr", currentLocale);
        System.out.println(resourceBundle.getString("Formal"));
        System.out.println(resourceBundle.getString("Casual"));
    }
}
