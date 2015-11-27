package com.test.tennis.game;
//import static org.hamcrest.*;
//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.*;

import com.tennis.game.Deuce;
import com.tennis.game.Game;
import com.tennis.game.IGame;
import com.tennis.game.Initial;
import com.tennis.game.Over;
import com.tennis.game.Player;
import com.tennis.game.enumerator.Score;


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
	        System.out.println(Initial.ID);
	        assertNotNull(initial.nextState(p1));
	        assertFalse(initial.isOver());
	    }
	 @Test
	    public void TestOverState() {
	        System.out.println("Test Over State");
	        IGame over = new Over(p1, p2);
	        System.out.println(Over.ID);
	        assertNotNull( over.nextState(p1));
	        assertTrue(over.isOver());
	    }
	 @Test
	    public void TestDeuceState() {
	        System.out.println("Test Deuce State");
	        IGame deuce = new Deuce(p1, p2);
	        System.out.println(Over.ID);
	        assertNotNull( deuce.nextState(p1));
	        assertFalse(deuce.isOver());
	    }
	 
}
