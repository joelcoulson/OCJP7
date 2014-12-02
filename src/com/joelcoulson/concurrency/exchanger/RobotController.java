package com.joelcoulson.concurrency.exchanger;

import java.util.concurrent.Exchanger;

public class RobotController {

    public static void main(String[] args) {

        Exchanger<String> exchanger = new Exchanger<>();

        Robot1 robot1 = new Robot1(exchanger);
        Robot2 robot2 = new Robot2(exchanger);

        robot1.start();
        robot2.start();
    }
}
