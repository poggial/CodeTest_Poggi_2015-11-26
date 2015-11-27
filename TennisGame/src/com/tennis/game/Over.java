package com.tennis.game;

public class Over implements IGame {
	public static String ID = Over.class.getSimpleName();
	Player winner,loser;
	
	public Over(Player winner,Player loser){
		this.winner = winner;
		this.loser =loser;
	}
	@Override
	public IGame nextState(Player point) {
		// TODO Auto-generated method stub
		winner = point;
		return new Over(winner,loser);
	}

	@Override
	public boolean isOver() {
		// TODO Auto-generated method stub
		System.out.println(toString());
		return true;
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Game Finished: "+winner.getName()+" win!!";
 }
}
