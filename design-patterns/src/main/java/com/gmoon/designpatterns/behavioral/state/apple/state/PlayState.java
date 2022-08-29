package com.gmoon.designpatterns.behavioral.state.apple.state;

// Concrete State 2
public class PlayState implements State {

	@Override
	public State press() {
		System.out.println("play music.");
		return new StopState();
	}
}
