package com.joelcoulson.generics;

import java.util.ArrayList;

public class BoundedWildcardsTest {

    public static void main(String[] args) {
        BoundedWildcards bw = new BoundedWildcards();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        bw.sumAll(numbers);
    }
}
