package com.gmoon.designpatterns.behavioral.command.command;

import com.gmoon.designpatterns.behavioral.command.receiver.Light;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LightOnCommand implements Command {

	private final Light light;

	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		new LightOffCommand(light).execute();
	}
}
