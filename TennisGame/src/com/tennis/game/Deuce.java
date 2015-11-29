package com.tennis.game;

import com.tennis.game.enumerator.Score;

public class Deuce implements IGame {
	public static String ID = Deuce.class.getSimpleName();
	Player player1,player2;
	
	public Deuce(Player player1,Player player2){
		this.player1 = player1;
		this.player2 =player2;
		this.player1.setCurrentScore(Score.FORTY);
		this.player2.setCurrentScore(Score.FORTY);
	}
	@Override
	public IGame nextState(Player point) {
		if(point == player1){
			return new  Advantage(player1,player2);
		}
		else{
			return new  Advantage(player2,player1);
		}
	}

	@Override
	public boolean isOver() {
		System.out.println(toString());
		return false;
	}
@Override
public String toString() {
	return Score.DEUCE.getDescription();
 }
}
