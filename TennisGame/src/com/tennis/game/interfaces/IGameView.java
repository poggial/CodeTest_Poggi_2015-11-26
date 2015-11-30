package com.tennis.game.interfaces;

import com.tennis.game.controller.GameController;

public interface IGameView {

	void printScore(IGame current);

	void performStart();

	void setController(GameController gc);
}
