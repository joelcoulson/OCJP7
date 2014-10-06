package com.joelcoulson.collections;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {

    public static void main(String[] args) {
        String word1 = "one";
        String word2 = "two";
        String word3 = "three";

        HashMap<Integer, String> hm = new HashMap();

        hm.put(1, word1);
        hm.put(2, word2);
        hm.put(3, word3);
        hm.put(3, word3);   // wont add because this is a duplicate key
        hm.put(4, word3);   // will add as the key is unique

        // iterate through the set using the keys
        for(int key : hm.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hm.get(key));
        }

        // looking for an object within the HashMap based upon the key
        if(hm.containsKey(2)) {
            System.out.println("Exists!");
        }
    }
}
