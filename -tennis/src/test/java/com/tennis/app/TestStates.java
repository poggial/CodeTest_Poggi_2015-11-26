package com.tennis.app;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.tennis.game.interfaces.IGame;
import com.tennis.game.models.Player;
import com.tennis.game.states.Advantage;
import com.tennis.game.states.Deuce;
import com.tennis.game.states.Initial;
import com.tennis.game.states.Over;

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
		assertTrue(initial.winner()==null);
	}

	@Test
	public void TestOverState() {
		System.out.println("Test Over State");
		IGame over = new Over(p1, p2);
		assertNotNull(over.nextState(p1));
		assertTrue(over.winner()!=null);
	}

	@Test
	public void TestDeuceState() {
		System.out.println("Test Deuce State");
		IGame deuce = new Deuce(p1, p2);
		assertNotNull(deuce.nextState(p1));
		assertTrue(deuce.nextState(p1) instanceof Advantage);
		assertTrue(deuce.winner()==null);
	}

	@Test
	public void TestAdvantageState() {
		System.out.println("Test Advantage State");
		IGame advantage = new Advantage(p1, p2);
		assertNotNull(advantage.nextState(p1));
		assertTrue(advantage.nextState(p1) instanceof Deuce || advantage.nextState(p1) instanceof Over);
		assertTrue(advantage.winner()==null);
	}

}
