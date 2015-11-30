package com.test.tennis.game;
//import static org.hamcrest.*;
//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.*;

import com.tennis.game.controller.GameController;
import com.tennis.game.enumerator.Score;
import com.tennis.game.models.Player;
import com.tennis.game.view.ConsolleView;


public class TestGame {
	GameController game;
	 Player p1;
	 Player p2;
	 @Before
	    public void initialize() {
	        p1 = new Player("Djokovic");
	        p2 = new Player("Nadal");
	        game = new GameController(p1, p2, new ConsolleView(p1, p2));
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
