package com.tennis.game.interfaces;

import com.tennis.game.models.Player;

public interface IGame {
	IGame nextState(Player point);
	Player winner();
}
