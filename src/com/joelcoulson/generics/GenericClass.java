package com.joelcoulson.generics;

// the <T> indicates that the type is to be provided later
public class GenericClass<T> {
	
	private T val;
	
	public GenericClass(T val) {
		this.val = val;
	}
	
	public T getValue() {
		return val;
	}
}
