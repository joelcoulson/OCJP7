package com.joelcoulson.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String args[]) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");

        // note that explicitly declare the iterator as a string type
        Iterator<String> wordIterator = words.iterator();

        while(wordIterator.hasNext()) {
            // note that we need to call 'next' in order to cause the iterator
            // to move onto the next element within the collection
            String word = wordIterator.next();
            System.out.println(word);
        }
    }
}
