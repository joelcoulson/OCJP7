package com.joelcoulson.collections;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args) {

        NavigableMap<Integer, String> map = new TreeMap<>();

        map.put(1, "one");
        map.put(5, "five");
        map.put(2, "two");
        map.put(4, "four");
        map.put(6, "six");
        map.put(3, "three");

        // show all keys and their objects
        for(int key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // show a sorted list of keys and their values
        NavigableSet<Integer> sorted = map.navigableKeySet();
        for(int key : sorted) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // show the key/value pair higher than the key of 4
        int key = map.higherKey(4);
        System.out.println("The key value pair higher than 4. Key: " + key + ", Value: " + map.get(key));
    }
}
