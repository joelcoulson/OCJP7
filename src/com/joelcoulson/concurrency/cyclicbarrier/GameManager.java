package com.joelcoulson.concurrency.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class GameManager {

    public static void main(String[] args) {
        // note that the battlefield will only execute once all players are ready
        CyclicBarrier cyclicBarrier = new CyclicBarrier(4, new BattleField());
        Player player1 = new Player(cyclicBarrier, "Player1");
        player1.start();

        Player player2 = new Player(cyclicBarrier, "Player2");
        player2.start();

        Player player3 = new Player(cyclicBarrier, "Player3");
        player3.start();

        Player player4 = new Player(cyclicBarrier, "Player4");
        player4.start();
    }
}
