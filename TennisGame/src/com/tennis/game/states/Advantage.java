package com.tennis.game.states;

import com.tennis.game.enumerator.Score;
import com.tennis.game.interfaces.IGame;
import com.tennis.game.models.Player;

public class Advantage implements IGame {
	private Player advantage,player;
	
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
		return false;
	}
@Override
public String toString() {
	return Score.ADVANTAGE.getDescription()+ " "+ advantage.getName();
 }
@Override
public Player winner() {
	return null;
}
}
