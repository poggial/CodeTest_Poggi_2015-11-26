package com.tennis.game.states;

import com.tennis.game.interfaces.IGame;
import com.tennis.game.models.Player;

public class Over implements IGame {
	private Player winner,loser;
	
	public Over(Player winner,Player loser){
		this.winner = winner;
		this.loser =loser;
	}
	@Override
	public IGame nextState(Player point) {
		//maybe null
		
//		winner = point;
//		return new Over(winner,loser);
		return null;
	}

	@Override
	public boolean isOver() {
//		System.out.println(toString());
		return true;
	}
@Override
public String toString() {
	return "Game Finished: "+winner.getName()+" win!!";
 }
@Override
public Player winner() {
	return winner;
}
}
