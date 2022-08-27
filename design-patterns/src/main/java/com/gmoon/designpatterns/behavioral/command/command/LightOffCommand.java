package com.gmoon.designpatterns.behavioral.command.command;

import com.gmoon.designpatterns.behavioral.command.receiver.Light;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LightOffCommand implements Command {

	private final Light light;

	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		new LightOnCommand(light).execute();
	}
}
