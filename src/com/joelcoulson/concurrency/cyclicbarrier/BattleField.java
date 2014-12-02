package com.joelcoulson.concurrency.cyclicbarrier;

public class BattleField extends Thread {

    // this will only execute once all players are ready
    public void run() {
        System.out.println("All players are now ready. Let the battle begin!");
    }
}
