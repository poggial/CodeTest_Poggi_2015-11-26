package com.tennis.game.models;

import com.tennis.game.enumerator.Score;

public class Player {
	private String name;
	private Score current;

	public Player(String name) {
		this.name = name;
		current = Score.LOVE;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setCurrentScore(Score score) {
		this.current = score;
	}

	public Score getCurrentScore() {
		return this.current;
	}
}
