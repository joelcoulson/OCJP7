package com.joelcoulson.threads;

import java.util.*;

public class TestNumberThreads {
	
	public static void main(String[] args) {

		//withoutThreads();
		withThreads();
		
	}
	
	public static void withThreads() {

		ArrayList<NumbersThread> numbers = new ArrayList<NumbersThread>();

		for(int i = 0; i < 10; i++) {
			numbers.add(new NumbersThread());
		}

		// lets run the threads!
		try {
			for(NumbersThread number : numbers) {
				number.start();
				//number.join();
			}

            Thread.sleep(1000);

		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		
	}
	
	public static void withoutThreads() {
		
		Numbers numbers1, numbers2;
		numbers1 = new Numbers();
		numbers1.setNumber();
		numbers2 = new Numbers();
		numbers2.setNumber();
		
		System.out.println("Number: " + numbers1.getNumber());
		System.out.println("Number: " + numbers2.getNumber());
		
	}
	
}
