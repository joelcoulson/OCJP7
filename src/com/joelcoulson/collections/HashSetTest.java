package com.joelcoulson.collections;

import java.util.HashSet;

public class HashSetTest {

    public static void main(String args[]) {

        String word1 = "one";
        String word2 = "two";
        String word3 = "three";

        HashSet<String> hs = new HashSet();
        hs.add(word1);
        hs.add(word2);
        hs.add(word3);
        hs.add(word3);  // this wont be added as it's a duplicate

        for(String word : hs) {
            System.out.println(word);
        }
    }
}
