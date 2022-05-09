package com.gmoon.designpatterns.creational.abstractfactory;

public class Application {
	private final GUIFactory factory;
	private final Button button;
	private final Checkbox checkbox;

	public Application(GUIFactory factory) {
		this.factory = factory;
		this.button = factory.createButton();
		this.checkbox = factory.createCheckBox();
	}

	public void paint() {
		button.paint();
		checkbox.paint();
	}

	public static void main(String[] args) {
		Application application = new Application(new MacFactory());
		application.paint();
	}
}
