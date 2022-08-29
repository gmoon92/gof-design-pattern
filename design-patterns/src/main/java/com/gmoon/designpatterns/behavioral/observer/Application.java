package com.gmoon.designpatterns.behavioral.observer;

import com.gmoon.designpatterns.behavioral.observer.chat.ChatServer;
import com.gmoon.designpatterns.behavioral.observer.chat.User;

// Client
public class Application {

	public static void main(String[] args) {
		ChatServer chatServer = new ChatServer();
		User user1 = new User("gmoon");
		User user2 = new User("moons");

		String roomOfNewYork = "NewYork";
		String roomOfSeoul = "Seoul";

		chatServer.register(roomOfNewYork, user1);
		chatServer.register(roomOfNewYork, user2);
		chatServer.register(roomOfSeoul, user2);
		chatServer.register(roomOfSeoul, user1);

		chatServer.unregister(roomOfSeoul, user1);

		chatServer.sendMessage(user1, roomOfNewYork, "Welcome to new york.");
		chatServer.sendMessage(user1, roomOfSeoul, "Welcome to seoul.");
	}
}
