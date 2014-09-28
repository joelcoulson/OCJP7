package com.joelcoulson.generics;

public class GenericClassTest
{
	public static void main(String[] args) {
		// here we initialize one object as type Float and one as type String
		GenericClass<Float> sg1 = new GenericClass<Float>(10.0f);
		GenericClass<String> sg2 = new GenericClass<String>("This is just a test");

		System.out.println("Value stored within the generic is: " + sg1.getValue());
		System.out.println("Value stored within the generic is: " + sg2.getValue());
	}
}
