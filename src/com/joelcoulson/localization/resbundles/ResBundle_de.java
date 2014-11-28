package com.joelcoulson.localization.resbundles;

import java.util.ListResourceBundle;

public class ResBundle_de {

    // defining a resource object. here the key must be a string
    // but the value can be any type or object
    private Object[][] phrases = {
            {"Hello", "Hallo"},
            {"Goodbye", "Auf Wiedersehen"},
            {"I like meatballs", "Ich mag Fleischbällchen"}
    };

    // overridden method
    public Object[][] getContents() {
        return phrases;
    }
}
