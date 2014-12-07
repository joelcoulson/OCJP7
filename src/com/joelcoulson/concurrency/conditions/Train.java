package com.joelcoulson.concurrency.conditions;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Train extends Thread {

    private String name;
    private Person person;
    private Lock lock;
    private Condition condition;

    public Train(String name, Person person, Lock lock, Condition condition) {
        this.name = name;
        this.person = person;
        this.lock = lock;
        this.condition = condition;
    }

    public void run() {
        try {
            // the train takes a few seconds to arrive at the station
            sleep((long)(Math.random()*10000));

            // we've arrived at the station. get a lock
            if(!(lock.tryLock(10, TimeUnit.SECONDS))) {
                System.out.println("Couldn't get a lock on the station in time");
            }

            System.out.println(name + " has arrived at the station");

            // lets see if joel is on board, if he is, announce it all threads!
            Pattern pattern = Pattern.compile("Joel");
            Matcher matcher = pattern.matcher(person.getName());
            if(matcher.find()) {
                condition.signalAll();
            }

        } catch(InterruptedException ie) {
            // always unlock
            lock.unlock();
            ie.printStackTrace();
        } finally {
            // always unlock
            lock.unlock();
        }
    }
}
