package com.joelcoulson.collections;

import java.util.Arrays;

public class ArraysClassTest {

    public static void main(String[] args) {

        String names[] = {"Joel", "Danno", "Franky", "Bob", "James"};

        // Arrays methods are all static
        Arrays.sort(names);

        printNames(names);

        // binarySearch returns the element index of the match
        System.out.println("Joel was found at array element: " + Arrays.binarySearch(names, "Joel"));
        System.out.println("Billy-Bob was found at array element: " + Arrays.binarySearch(names, "Billy-Bob"));
    }

    // bounded wildcard, because we can!
    public static void printNames(String[] names) {
        for(String name : names) {
            System.out.println(name);
        }
    }
}
