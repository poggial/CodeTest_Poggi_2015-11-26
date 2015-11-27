package com.tennis.game;

public class Advantage implements IGame {
	public static String ID = Advantage.class.getSimpleName();
	Player advantage,player;
	
	public Advantage(Player ad,Player nad ){
		this.advantage=ad;
		this.player=nad;
	}
	@Override
	public IGame nextState(Player point) {
		return null;
	}

	@Override
	public boolean isOver() {
		return false;
	}
@Override
public String toString() {
	return "Advantage "+advantage.getName();
 }
}
