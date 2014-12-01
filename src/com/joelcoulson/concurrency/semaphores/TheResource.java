package com.joelcoulson.concurrency.semaphores;

import java.util.concurrent.Semaphore;

public class TheResource {

    public static void main(String[] args) {
        // we can only have two people accessing the resource at once
        Semaphore semaphore = new Semaphore(2);

        // list of people trying to access it
        new Person("Joel", semaphore);
        new Person("Franky", semaphore);
        new Person("Tina", semaphore);
        new Person("William", semaphore);
        new Person("John", semaphore);
    }
}
