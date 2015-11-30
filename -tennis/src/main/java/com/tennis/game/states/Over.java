package com.tennis.game.states;

import com.tennis.game.interfaces.IGame;
import com.tennis.game.models.Player;

public class Over implements IGame {
	private Player winner, loser;

	public Over(Player winner, Player loser) {
		this.winner = winner;
		this.loser = loser;
	}

	public IGame nextState(Player point) {
		// maybe null

		// winner = point;
		// return new Over(winner,loser);
		return null;
	}

	@Override
	public String toString() {
		return "Game Finished: " + winner.getName() + " win!!";
	}

	public Player winner() {
		return winner;
	}
}
