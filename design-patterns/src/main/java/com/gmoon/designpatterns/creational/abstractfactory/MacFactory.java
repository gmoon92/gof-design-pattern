package com.gmoon.designpatterns.creational.abstractfactory;

public class MacFactory implements GUIFactory {
	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public Checkbox createCheckBox() {
		return new MacCheckbox();
	}
}
