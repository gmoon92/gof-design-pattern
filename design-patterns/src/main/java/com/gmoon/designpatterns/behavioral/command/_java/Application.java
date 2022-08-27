package com.gmoon.designpatterns.behavioral.command._java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.gmoon.designpatterns.behavioral.command.receiver.Game;
import com.gmoon.designpatterns.behavioral.command.receiver.Light;

public class Application {

	public static void main(String[] args) {
		// Receiver(수신자)
		Light light = new Light();
		Game game = new Game();

		// Command
		Runnable startGame = game::start;
		Runnable endGame = game::end;
		Runnable offLight = light::off;

		// Invoker(호출자)
		ExecutorService executorService = Executors.newFixedThreadPool(4);
		executorService.submit(startGame);
		executorService.submit(endGame);
		executorService.submit(offLight);
		executorService.shutdown();
	}
}
