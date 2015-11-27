package com.tennis.game;

import com.tennis.game.enumerator.Score;

public class Deuce implements IGame {
	public static String ID = Deuce.class.getSimpleName();
	Player player1,player2;
	
	public Deuce(Player player1,Player player2){
		this.player1 = player1;
		this.player2 =player2;
	}
	@Override
	public IGame nextState(Player point) {
		point.setCurrentScore(Score.ADVANTAGE);
		return new Advantage(point==player1?player1:player2,point==player2?player2:player1);
	}

	@Override
	public boolean isOver() {
		return false;
	}
@Override
public String toString() {
	return "Deuce";
 }
}
