package com.test.tennis.game;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.tennis.game.Advantage;
import com.tennis.game.Deuce;
import com.tennis.game.IGame;
import com.tennis.game.Initial;
import com.tennis.game.Over;
import com.tennis.game.Player;

public class TestStates {
	Player p1;
	Player p2;

	@Before
	public void initialize() {
		System.out.println("Initialize Test...");
		p1 = new Player("Mario");
		p2 = new Player("Luigi");
	}

	@Test
	public void TestIntialState() {
		System.out.println("Test initial State");
		IGame initial = new Initial(p1, p2);
		assertNotNull(initial.nextState(p1));
		assertTrue(initial.nextState(p1) instanceof Over || initial.nextState(p1) instanceof Deuce);
		assertFalse(initial.isOver());
	}

	@Test
	public void TestOverState() {
		System.out.println("Test Over State");
		IGame over = new Over(p1, p2);
		assertNotNull(over.nextState(p1));
		assertTrue(over.isOver());
	}

	@Test
	public void TestDeuceState() {
		System.out.println("Test Deuce State");
		IGame deuce = new Deuce(p1, p2);
		assertNotNull(deuce.nextState(p1));
		assertTrue(deuce.nextState(p1) instanceof Advantage);
		assertFalse(deuce.isOver());
	}

	@Test
	public void TestAdvantageState() {
		System.out.println("Test Advantage State");
		IGame advantage = new Advantage(p1, p2);
		assertNotNull(advantage.nextState(p1));
		assertTrue(advantage.nextState(p1) instanceof Deuce || advantage.nextState(p1) instanceof Over);
		assertFalse(advantage.isOver());
	}

}
