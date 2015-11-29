package com.tennis.game;

import com.tennis.game.enumerator.Score;

public class Game {
	protected Player p1, p2;
	protected IGame current;

	public Game(Player p1, Player p2) {
		this.p1 = p1;
		this.p2 = p2;
		resetGame();
	}

	public void resetGame() {
		this.current = new Initial(p1, p2);

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
		while (!this.current.isOver()) {
			if (Math.random() < 0.5) {
				score(p1);
			} else {
				score(p2);
			}

		}
	}
}
