package com.gmoon.designpatterns.behavioral.memento.game;

import java.util.Stack;

// Caretaker
public final class GamePlayerStage {

	private final Stack<GameSave> stages = new Stack<>();

	public void save(Game game) {
		GameSave gameSave = game.save();
		stages.push(gameSave);
	}

	public Game restore() {
		if (stages.isEmpty()) {
			throw new RuntimeException("저장된 스테이지가 존재하지 않습니다.");
		}

		GameSave gameSave = stages.pop();
		return Game.load(gameSave);
	}
}
