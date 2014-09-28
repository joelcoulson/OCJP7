package com.joelcoulson.generics;

import java.util.ArrayList;

public class GenericMethod {
	
	// note the use of the <T> just after the public access modifier
	// this tells the compiler that the type shall be supplied at run time
	public <T> void showAll(ArrayList<T> list) {
		for(T value: list) {
			System.out.println("Value: " + value);
		}
	}
}
