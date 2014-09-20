package com.joelcoulson.statics;

public class CounterTest {

    public static void main(String[] args) {

        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        counter1.incrementCounter();
        System.out.println("Counter value is: " + counter1.getCounter());

        counter2.incrementCounter();
        System.out.println("Counter value is: " + counter2.getCounter());

        counter1.incrementCounter();
        System.out.println("Counter value is: " + counter1.getCounter());

        counter2.incrementCounter();
        System.out.println("Counter value is: " + counter2.getCounter());
    }

}
