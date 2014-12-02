package com.joelcoulson.concurrency.exchanger;

import java.util.concurrent.Exchanger;

public class Robot1 extends Thread {

    private Exchanger<String> comms;

    // the exchanger object will be used as the conduit
    public Robot1(Exchanger<String> comms) {
        this.comms = comms;
    }

    public void run() {
        try {
            // send a string to robot2 and receive its reply
            String reply = comms.exchange("Hi, my name is Robot1");
            System.out.println("Robot1 received: " + reply);
        } catch(InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
