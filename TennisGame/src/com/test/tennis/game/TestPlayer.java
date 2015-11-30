package com.test.tennis.game;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.tennis.game.enumerator.Score;
import com.tennis.game.models.Player;

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
		assertEquals(Score.LOVE, player.getCurrentScore());
		player.setCurrentScore(Score.FIFTEEN);
		assertEquals(Score.FIFTEEN, player.getCurrentScore());
		player.setCurrentScore(Score.THIRTY);
		assertEquals(Score.THIRTY, player.getCurrentScore());
		player.setCurrentScore(Score.FORTY);
		assertEquals(Score.FORTY, player.getCurrentScore());
		player.setCurrentScore(Score.DEUCE);
		assertEquals(Score.DEUCE, player.getCurrentScore());
		player.setCurrentScore(Score.ADVANTAGE);
		assertEquals(Score.ADVANTAGE, player.getCurrentScore());

	}

}
