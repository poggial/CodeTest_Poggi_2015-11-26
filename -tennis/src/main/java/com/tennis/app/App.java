package com.tennis.app;

import com.tennis.game.controller.GameController;
import com.tennis.game.models.Player;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Player player1 = new Player("Player1");
		Player player2 = new Player("Player2");
		GameController game = new GameController(player1, player2);
		System.out.println("Start Simulation");
		game.simulate();
    }
}
