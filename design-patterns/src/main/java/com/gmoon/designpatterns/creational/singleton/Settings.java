package com.gmoon.designpatterns.creational.singleton;

public class Settings {
	private final static Settings INSTANCE = new Settings();

	private Settings() {
	}

	public static Settings getInstance() {
		return INSTANCE;
	}
}
