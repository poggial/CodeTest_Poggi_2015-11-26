package com.tennis.game;

import com.tennis.game.enumerator.Score;

public class Initial implements IGame {
	public static String ID = Initial.class.getSimpleName();
	Player p1,p2;
	public Initial(Player p1, Player p2){
		this.p1 =p1;
		this.p2=p2;
		this.p1.setCurrentScore(Score.LOVE);
		this.p2.setCurrentScore(Score.LOVE);
	}
	@Override
	public IGame nextState(Player point) {
		// TODO Auto-generated method stub
		if(Score.FORTY==p1.getCurrentScore() && Score.FORTY==p2.getCurrentScore()){
			//parità
			return new Deuce(p1,p2);
		}
		if(point ==p1){
			return new Over(p1, p2);
		}else if (point ==p2){
			return new Over(p2,p1);
		}
		return null;
	}

	@Override
	public boolean isOver() {
		// TODO Auto-generated method stub
		return false;
	}

}
