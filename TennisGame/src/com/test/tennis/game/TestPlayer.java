package com.test.tennis.game;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.tennis.game.Player;
import com.tennis.game.enumerator.Score;

public class TestPlayer {
Player player;
	 @Before
	    public void initialize() {
		 player = new Player("Player1");
	 }
	 
	 @Test
	  public void TestNameNotNull() {
		 
		 assertNotNull(player.getName());
	 }
	 @Test
	  public void TestScores() {
			player.setCurrentScore(Score.LOVE);
				assertEquals(Score.LOVE,player.getCurrentScore());
	 }
	 
}
