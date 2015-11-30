package com.tennis.game.interfaces;

import com.tennis.game.models.Player;

public interface IGame {
	public IGame nextState(Player point);
	public Player winner();
}
