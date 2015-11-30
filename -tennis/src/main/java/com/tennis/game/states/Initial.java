package com.tennis.game.states;

import com.tennis.game.enumerator.Score;
import com.tennis.game.interfaces.IGame;
import com.tennis.game.models.Player;

public class Initial implements IGame {
	private Player p1, p2;

	public Initial(Player p1, Player p2) {
		this.p1 = p1;
		this.p2 = p2;
		this.p1.setCurrentScore(Score.LOVE);
		this.p2.setCurrentScore(Score.LOVE);
	}

	public IGame nextState(Player point) {
		if (Score.FORTY == p1.getCurrentScore() && Score.FORTY == p2.getCurrentScore()) {
			// parità
			return new Deuce(p1, p2);
		}
		if (point == p1) {
			return new Over(p1, p2);
		} else if (point == p2) {
			return new Over(p2, p1);
		}
		return null;
	}

	@Override
	public String toString() {
		return p1.getName() + " " + p1.getCurrentScore().getDescription() + " - "
				+ p2.getCurrentScore().getDescription() + " " + p2.getName();
	}

	public Player winner() {
		return null;
	}
}
