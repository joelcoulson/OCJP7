package com.joelcoulson.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTest {

    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque();

        deque.add("Bob");
        deque.add("Frank");
        deque.add("Henry");

        showCollection(deque);

        deque.addFirst("First");
        deque.addLast("Last");

        showCollection(deque);
    }

    public static void showCollection(Deque<String> deque) {
        for(String word : deque) {
            System.out.println(word);
        }
    }
}
