package com.gmoon.designpatterns.behavioral.memento.game;

import lombok.Getter;
import lombok.Setter;

// Originator
@Getter
@Setter
public class Game {

	private int score;
	private int level;

	public static Game load(GameSave gameSave) {
		Game game = new Game();
		game.score = gameSave.getScore();
		game.level = gameSave.getLevel();
		return game;
	}

	GameSave save() {
		return new GameSave(score, level);
	}
}
