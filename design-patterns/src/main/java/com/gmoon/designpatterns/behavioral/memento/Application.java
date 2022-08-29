package com.gmoon.designpatterns.behavioral.memento;

import com.gmoon.designpatterns.behavioral.memento.game.Game;
import com.gmoon.designpatterns.behavioral.memento.game.GamePlayerStage;

// Client
public class Application {

	public static void main(String[] args) {
		// Caretaker
		GamePlayerStage stage = new GamePlayerStage();

		int initScore = 80;
		int initLevel = 10;
		Game game = new Game();
		game.setScore(initScore);
		game.setLevel(initLevel);

		// captured memento
		stage.save(game);

		// modified state
		game.setScore(100);
		game.setLevel(50);

		// restored
		Game loadedGame = stage.restore();
		assert loadedGame.getScore() == initScore;
		assert loadedGame.getLevel() == initLevel;
	}
}
