package com.joelcoulson.localization;

import java.util.Locale;

public class AvailableLocales {

    public static void main(String[] args) {
        // shows the default locale
        System.out.println("The default locale is: " + Locale.getDefault());

        // shows all locales
        Locale[] locales = Locale.getAvailableLocales();
        for(Locale locale : locales) {
            System.out.println("Available locale: " + locale);
        }
    }

}
