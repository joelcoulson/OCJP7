package com.joelcoulson.localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundlesTest {

    public static void sayPhrases(ResourceBundle resourceBundle) {
        System.out.println("Hello: " + resourceBundle.getString("Hello"));
        System.out.println("Goodbye: " + resourceBundle.getString("Goodbye"));
        System.out.println("I like meatballs: " + resourceBundle.getString("I like meatballs"));
    }

    public static void main(String[] args) {
        // german phrases
        Locale locale_de = new Locale("de");
        sayPhrases(ResourceBundle.getBundle("ResBundle", locale_de));

        // italy phrases
        Locale locale_it = new Locale("it");
        sayPhrases(ResourceBundle.getBundle("ResBundle", locale_it));
    }
}
