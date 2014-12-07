package com.joelcoulson.concurrency.threadpools;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {

    public static void main(String[] args) {
        try {
            // get a callable tasks to be submitted to the executor service
            Callable<Integer> task1 = new AddNumbers(3, 2);
            Callable<Integer> task2 = new AddNumbers(4, 3);
            Callable<Integer> task3 = new AddNumbers(5, 4);
            Callable<Integer> task4 = new AddNumbers(6, 5);
            Callable<Integer> task5 = new AddNumbers(7, 6);

            // create an executor service with a fixed thread pool consisting of 5 threads
            ExecutorService executorService = Executors.newFixedThreadPool(5);

            // submit the task to the executor service and store the future object
            Future<Integer> future1 = executorService.submit(task1);
            Future<Integer> future2 = executorService.submit(task2);
            Future<Integer> future3 = executorService.submit(task3);
            Future<Integer> future4 = executorService.submit(task4);
            Future<Integer> future5 = executorService.submit(task5);

            // wait for the get method that blocks until the thread has completed
            System.out.println("Result of task 1 is: " + future1.get());
            System.out.println("Result of task 2 is: " + future2.get());
            System.out.println("Result of task 3 is: " + future3.get());
            System.out.println("Result of task 4 is: " + future4.get());
            System.out.println("Result of task 5 is: " + future5.get());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
