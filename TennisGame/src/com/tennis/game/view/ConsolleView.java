package com.tennis.game.view;

import java.util.Scanner;

import com.tennis.game.controller.GameController;
import com.tennis.game.interfaces.IGame;
import com.tennis.game.interfaces.IGameView;
import com.tennis.game.models.Player;

public class ConsolleView implements IGameView {
	Player p1, p2;
	GameController gc;

	public ConsolleView(Player p1, Player p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	@Override
	public void printScore(IGame current) {
		if (current.winner() != null) {
			System.out.println("Game Finished!!\n" + current.winner().getName() + " win!!");
		} else {
			System.out.println(current.toString());
		}

	}

	@Override
	public void performStart() {
		System.out.println("\nStart match!");
		gc.simulate();
	}

	@Override
	public void setController(GameController gc) {
		this.gc = gc;
	}

	public void start() {
		System.out.println("=========================\n*       TENNIS GAME     *\n=========================");
		System.out.println("\nS)Start");
		System.out.println("\n1)Change Player1 Name");
		System.out.println("\nQ)Quit");
		Scanner sc = new Scanner(System.in);
		String command = "";
		while (!"Q".equals(command) && !"q".equals(command)) {
			command = sc.next();
			if ("s".equals(command) || "S".equals(command)) {
				gc.simulate();
			} else if ("1".equals(command)) {
				System.out.println("\nInsert Name and press enter:");
				p1.setName(sc.next());
			}

		}

		// gc.resetGame();
		// gc.simulate();

	}
}
