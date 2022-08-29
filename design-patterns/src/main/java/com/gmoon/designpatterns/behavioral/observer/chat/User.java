package com.gmoon.designpatterns.behavioral.observer.chat;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

// Concrete Observer
@RequiredArgsConstructor
@Getter
public class User implements Subscriber{

	private final String name;

	@Override
	public void handleMessage(String message) {
		System.out.format("[%s]: %s\n", name, message);
	}
}
