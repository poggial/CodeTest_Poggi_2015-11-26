package com.tennis.game;

import com.tennis.game.enumerator.Score;

public class Player {
private String name;
private Score current;

public Player(String name){
	this.name=name;
}
public void setName(String name){
	this.name = name;
}
public String getName(){
	return this.name;
}
public void setCurrentScore(Score score){
	this.current =score;
}
public Score getCurrentScore(){
return this.current;
}
}
