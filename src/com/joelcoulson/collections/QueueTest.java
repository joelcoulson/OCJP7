package com.joelcoulson.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {

        Queue<String> linkedList = new LinkedList();

        linkedList.add("Andy");
        linkedList.add("Frank");
        linkedList.add("Danny");
        linkedList.add("Henry");
        linkedList.add("Bob");

        // remove the last two elements
        linkedList.remove();
        linkedList.remove();

        for(String name : linkedList) {
            System.out.println(name);
        }
    }
}
