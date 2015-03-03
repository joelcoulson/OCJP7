package com.joelcoulson.concurrency.semaphores;

import java.util.concurrent.Semaphore;

public class TheResource {

    public static void main(String[] args) {

        // allow only two objects to lock it at once
        Semaphore semaphore = new Semaphore(2);

        Thread thread1 = new Thread(new Person("Bert", semaphore));
        Thread thread2 = new Thread(new Person("Andy", semaphore));
        Thread thread3 = new Thread(new Person("Roger", semaphore));
        Thread thread4 = new Thread(new Person("Graham", semaphore));
        Thread thread5 = new Thread(new Person("Will", semaphore));
        Thread thread6 = new Thread(new Person("John", semaphore));
        Thread thread7 = new Thread(new Person("Joel", semaphore));
        Thread thread8 = new Thread(new Person("Tina", semaphore));
        Thread thread9 = new Thread(new Person("Andrew", semaphore));
        Thread thread10 = new Thread(new Person("Craig", semaphore));

    }

}
