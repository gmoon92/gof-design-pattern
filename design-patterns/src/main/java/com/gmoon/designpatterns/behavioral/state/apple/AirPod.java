package com.gmoon.designpatterns.behavioral.state.apple;

import com.gmoon.designpatterns.behavioral.state.apple.state.ReadyState;
import com.gmoon.designpatterns.behavioral.state.apple.state.State;

// Context
public class AirPod {

	private State state;

	public AirPod() {
		this.state = new ReadyState();
	}

	public void press() {
		this.state = state.press();
	}

	public void changeState(State state) {
		this.state = state;
	}
}
