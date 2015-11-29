package com.tennis.game;

import com.tennis.game.enumerator.Score;

public class Advantage implements IGame {
	public static String ID = Advantage.class.getSimpleName();
	Player advantage,player;
	
	public Advantage(Player ad,Player nad ){
		this.advantage=ad;
		this.player=nad;
		this.advantage.setCurrentScore(Score.ADVANTAGE);
		this.player.setCurrentScore(Score.FORTY);
	}
	@Override
	public IGame nextState(Player point) {
		if(point == advantage){
			return new Over(advantage, player);
			
		}else if(point ==player){
			return new Deuce(advantage, player);
			
		}
		return null;
	}

	@Override
	public boolean isOver() {
		System.out.println(toString());
		return false;
	}
@Override
public String toString() {
	return Score.ADVANTAGE.getDescription()+ " "+ advantage.getName();
 }
}
