package com.tennis.main;

import com.tennis.game.controller.GameController;
import com.tennis.game.models.Player;
import com.tennis.game.view.ConsolleView;

public class AppConsole {
	public static void main(String[] args) {
		Player player1 = new Player("Player1");
		Player player2 = new Player("Player2");
		GameController controller = new GameController(player1, player2);
		controller.simulate();
	}
}
