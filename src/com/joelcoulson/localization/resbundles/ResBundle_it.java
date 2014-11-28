package com.joelcoulson.localization.resbundles;

import java.util.ListResourceBundle;

public class ResBundle_it extends ListResourceBundle {

    // defining a resource object. here the key must be a string
    // but the value can be any type or object
    private Object[][] phrases = {
            {"Hello", "Ciao"},
            {"Goodbye", "Arrivederci"},
            {"I like meatballs", "Mi piace polpette"}
    };

    // overridden method
    public Object[][] getContents() {
        return phrases;
    }
}
