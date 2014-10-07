package com.joelcoulson.collections;

import java.util.Collections;
import java.util.LinkedList;

public class CollectionsClassTest {

    public static void main(String[] args) {

        // here we test a few of the methods within in the Collections class against a LinkedList collection
        LinkedList<String> names = new LinkedList();

        names.add("Joel");
        names.add("Zac");
        names.add("Dan");
        names.add("Andy");
        names.add("Bill");

        // Collections methods are all static
        Collections.sort(names);

        printNames(names);

        Collections.reverse(names);

        printNames(names);
    }

    // bounded wildcard, because we can!
    public static void printNames(LinkedList<? extends String> names) {
        for(String name : names) {
            System.out.println(name);
        }
    }
}
