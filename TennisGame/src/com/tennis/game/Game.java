package com.tennis.game;

import com.tennis.game.enumerator.Score;

public class Game {
	Player p1,p2;
	Score score;
	public Game(Player p1,Player p2){
		this.p1=p1;
		this.p2=p2;
		resetGame();
	}
	public void resetGame(){
		this.p1.setCurrentScore(Score.LOVE);
		this.p2.setCurrentScore(Score.LOVE);
	}
}
