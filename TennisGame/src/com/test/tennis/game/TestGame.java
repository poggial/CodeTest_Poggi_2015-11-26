package com.test.tennis.game;
//import static org.hamcrest.*;
//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.*;

import com.tennis.game.Game;
import com.tennis.game.Player;
import com.tennis.game.enumerator.Score;


public class TestGame {
	Game game;
	 Player p1;
	 Player p2;
	 @Before
	    public void initialize() {
	        p1 = new Player("Djokovic");
	        p2 = new Player("Nadal");
	        game = new Game(p1, p2);
	    }

	 @Test
	    public void TestStartScore0_0() {
	        System.out.println("Test Score");
	        assertTrue(p1.getCurrentScore()==Score.LOVE && p2.getCurrentScore()==Score.LOVE);
	    }
	 @Test
	    public void TestSimulate() {
	        System.out.println("Test Score");
	       game.simulate();
	    }
}
