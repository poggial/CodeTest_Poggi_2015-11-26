package com.tennis.game.controller;

import com.tennis.game.enumerator.Score;
import com.tennis.game.interfaces.IGame;
import com.tennis.game.models.Player;
import com.tennis.game.states.Initial;

public class GameController {
	private Player player1;
	private Player player2;
	private IGame current;

	public GameController(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;

	}

	public void resetGame() {
		this.current = new Initial(player1, player2);

	}

	protected void score(Player p) {
		if (p.getCurrentScore() == Score.FORTY || p.getCurrentScore() == Score.DEUCE
				|| p.getCurrentScore() == Score.ADVANTAGE) {
			this.current = this.current.nextState(p);
		} else {
			p.setCurrentScore(Score.values()[p.getCurrentScore().ordinal() + 1]);
		}

	}

	public void simulate() {
		resetGame();

		while (this.current.winner() == null) {
			updateView();
			if (Math.random() < 0.5) {
				score(player1);
			} else {
				score(player2);
			}

		}
		// Final state
		updateView();

	}

	protected void updateView() {
		System.out.println(current.toString());
	}
}
