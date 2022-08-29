package com.gmoon.designpatterns.behavioral.state;

import com.gmoon.designpatterns.behavioral.state.apple.AirPod;
import com.gmoon.designpatterns.behavioral.state.apple.state.PlayState;

// Client
public class Application {

	public static void main(String[] args) {
		AirPod player = new AirPod();

		player.press();
		player.press();
		player.press();

		player.changeState(new PlayState());
		player.press();
	}
}
