package com.tennis.game;

import com.tennis.game.enumerator.Score;

public class Game {
	Player p1,p2;
	IGame  current;
	public Game(Player p1,Player p2){
		this.p1=p1;
		this.p2=p2;
		resetGame();
	}
	public void resetGame(){
		current = new Initial(p1, p2);
		
	}
	protected void score(Player p){
		if(p.getCurrentScore() ==Score.FORTY){
			current = current.nextState(p);
		}else{
			p.setCurrentScore(Score.values()[p.getCurrentScore().ordinal()+1]);
		}
		
	}
	public void simulate(){
		while(!current.isOver()){
			System.out.println(p1.getName()+" "+ p1.getCurrentScore().toString()+" - "+
		p2.getCurrentScore().toString()+" "+ p2.getName());
			if(Math.random()<0.5){
				score(p1);
			}else{
				score(p2);
			}
		}
	
		
	}
}
