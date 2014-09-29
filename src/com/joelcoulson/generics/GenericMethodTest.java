package com.joelcoulson.generics;

import java.util.ArrayList;

public class GenericMethodTest {
	public static void main(String args[]) {
		GenericMethod gm = new GenericMethod();
		
		ArrayList<String> words = new ArrayList();
		words.add("one");
		words.add("two");
		words.add("three");
		
		ArrayList<Integer> numbers = new ArrayList();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		gm.showAll(words);
		gm.showAll(numbers);
	}
}
