package com.joelcoulson.concurrency.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class TheRace {

    public static void main(String[] args) {

        // we create a new countdownlatch with a timer of 5 seconds
        CountDownLatch countDownLatch = new CountDownLatch(5);

        // instantiate the runners
        new Person("Joel", countDownLatch);
        new Person("Franky", countDownLatch);
        new Person("Tina", countDownLatch);
        new Person("William", countDownLatch);
        new Person("John", countDownLatch);

        try {

            // count down from 5 and then start the race
            while (countDownLatch.getCount() > 0) {
                Thread.sleep(1000);
                System.out.println("Race starts in " + countDownLatch.getCount()  + " milliseconds");

                // count down by a second
                countDownLatch.countDown();
            }

            // the semaphore will then unblock as soon as the countDownLatch hits 0

        } catch(InterruptedException ie) {
            ie.printStackTrace();
        }

    }
}
