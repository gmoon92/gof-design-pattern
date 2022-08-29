package com.gmoon.designpatterns.behavioral.state.apple.state;

// Concrete State 2
public class StopState implements State {

	@Override
	public State press() {
		System.out.println("stop music.");
		return new PlayState();
	}
}
