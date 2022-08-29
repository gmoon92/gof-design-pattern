package com.gmoon.designpatterns.behavioral.observer.chat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Subject (Publisher)
public class ChatServer {

	private final Map<String, List<Subscriber>> subscribers = new HashMap<>();

	public void register(String room, Subscriber subscriber) {
		if (existsRoom(room)) {
			getSubscribers(room).add(subscriber);
		} else {
			List<Subscriber> roomSubscribers = new ArrayList<>();
			roomSubscribers.add(subscriber);
			subscribers.put(room, roomSubscribers);
		}
	}

	public void unregister(String room, Subscriber subscriber) {
		if (existsRoom(room)) {
			getSubscribers(room).remove(subscriber);
		}
	}

	public void sendMessage(User sender, String room, String message) {
		if (existsRoom(room)) {
			String roomMessage = String.format("[room-%s] [%s]: %s",
			  room, sender.getName(), message);

			getSubscribers(room)
			  .forEach(s -> s.handleMessage(roomMessage));
		}
	}

	private List<Subscriber> getSubscribers(String room) {
		return subscribers.get(room);
	}

	private boolean existsRoom(String room) {
		return subscribers.containsKey(room);
	}
}
