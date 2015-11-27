package com.tennis.game;

public interface IGame {
IGame nextState(Player point);
boolean isOver();
}
