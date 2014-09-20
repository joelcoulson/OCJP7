package com.joelcoulson.threads;

public class NumbersThread extends Thread {
	
	private Numbers number;
	
	public NumbersThread() {
        this.number = new Numbers();
        this.number.setNumber();
	}
	
	public void getNumber() {
		System.out.println("Number is: " + number.getNumber());
	}

	public void run() {
		getNumber();
	}
	
}
