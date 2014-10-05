package com.joelcoulson.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {

    public static void main(String[] args) {

        LinkedList<String> words = new LinkedList<String>();
        words.add(0, new String("zero"));
        words.add(1, new String("one"));
        words.add(2, new String("two"));

        // we can now overwrite the element at index 1
        words.set(1, new String("ONE"));

        // iterating through the list forwards
        // note we use a list (for linked list) iterator
        ListIterator<String> iterator = words.listIterator(0);

        while(iterator.hasNext()) {
            String word = iterator.next();
            System.out.println(word);
        }

        // iterating through the list backwards
        // note that we set the list iterator to the last element
        iterator = words.listIterator(words.size());
        while(iterator.hasPrevious()) {
            String word = iterator.previous();
            System.out.println(word);
        }
    }
}
