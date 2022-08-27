package com.gmoon.designpatterns.behavioral.command.command;

import com.gmoon.designpatterns.behavioral.command.receiver.Game;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GameStartCommand implements Command {

	private final Game game;

	@Override
	public void execute() {
		game.start();
	}

	@Override
	public void undo() {
		new GameEndCommand(game).execute();
	}
}
