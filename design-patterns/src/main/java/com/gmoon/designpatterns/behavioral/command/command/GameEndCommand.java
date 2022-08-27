package com.gmoon.designpatterns.behavioral.command.command;

import com.gmoon.designpatterns.behavioral.command.receiver.Game;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GameEndCommand implements Command {

	private final Game game;

	@Override
	public void execute() {
		game.end();
	}

	@Override
	public void undo() {
		new GameStartCommand(game).execute();
	}
}
