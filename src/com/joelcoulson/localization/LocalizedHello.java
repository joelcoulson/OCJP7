package com.joelcoulson.localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizedHello {

    public static void main(String[] args) {
        Locale currentLocale = Locale.getDefault();
        ResourceBundle resourceBundle = ResourceBundle.getBundle("Greetings", currentLocale);
        System.out.println(resourceBundle.getString("Formal"));
    }
}
