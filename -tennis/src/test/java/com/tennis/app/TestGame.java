package com.tennis.app;

//import static org.hamcrest.*;
//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.tennis.game.controller.GameController;
import com.tennis.game.enumerator.Score;
import com.tennis.game.models.Player;

public class TestGame {
	GameController game;
	Player p1;
	Player p2;

	@Before
	public void initialize() {
		p1 = new Player("Djokovic");
		p2 = new Player("Nadal");
		game = new GameController(p1, p2);
	}

	@Test
	public void TestStartScore0_0() {
		System.out.println("Test Score");
		assertTrue(p1.getCurrentScore() == Score.LOVE && p2.getCurrentScore() == Score.LOVE);
	}

	@Test
	public void TestSimulate() {
		System.out.println("Test Score");
		game.simulate();
	}

}