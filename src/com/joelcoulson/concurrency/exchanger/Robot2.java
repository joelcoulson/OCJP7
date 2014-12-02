package com.joelcoulson.concurrency.exchanger;

import java.util.concurrent.Exchanger;

public class Robot2 extends Thread {

    private Exchanger<String> comms;

    // the exchanger object will be used as the conduit
    public Robot2(Exchanger<String> comms) {
        this.comms = comms;
    }

    public void run() {
        try {
            // send a string to robot1 and receive its reply
            String reply = comms.exchange("Hi, my name is Robot2");
            System.out.println("Robot2 received: " + reply);
        } catch(InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
