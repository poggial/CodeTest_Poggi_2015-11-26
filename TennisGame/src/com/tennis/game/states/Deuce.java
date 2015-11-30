package com.tennis.game.states;

import com.tennis.game.enumerator.Score;
import com.tennis.game.interfaces.IGame;
import com.tennis.game.models.Player;

public class Deuce implements IGame {
	private Player player1, player2;

	public Deuce(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
		this.player1.setCurrentScore(Score.FORTY);
		this.player2.setCurrentScore(Score.FORTY);
	}

	@Override
	public IGame nextState(Player point) {
		if (point == player1) {
			return new Advantage(player1, player2);
		} else {
			return new Advantage(player2, player1);
		}
	}

	@Override
	public boolean isOver() {
		return false;
	}

	@Override
	public String toString() {
		return Score.DEUCE.getDescription();
	}

	@Override
	public Player winner() {
		// TODO Auto-generated method stub
		return null;
	}
}
