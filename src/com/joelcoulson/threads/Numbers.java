package com.joelcoulson.threads;

public class Numbers {
	
	private long number;
	
	public Numbers() {
		
	}
	
	public void setNumber() {
		this.number = (long)(Math.random()*Long.MAX_VALUE);
	}
	
	public long getNumber() {
		return this.number;
	}
	
}
