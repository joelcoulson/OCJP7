package com.joelcoulson.localization;

import java.util.Locale;

public class SettingTheLocale {

    public static void main(String[] args) {

        // setting the default locale
        Locale.setDefault(Locale.GERMAN);

        // creating and setting out own locale (french australian!)
        Locale customLocale = new Locale("fr", "AU");
        Locale.setDefault(customLocale);

    }
}
