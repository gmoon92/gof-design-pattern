package com.gmoon.designpatterns.behavioral.state.apple.state;

// Concrete State 1
public class ReadyState implements State {

	@Override
	public State press() {
		System.out.println("ready.");
		return new PlayState();
	}
}
