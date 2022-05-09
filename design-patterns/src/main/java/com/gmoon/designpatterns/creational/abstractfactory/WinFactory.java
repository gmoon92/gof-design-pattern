package com.gmoon.designpatterns.creational.abstractfactory;

public class WinFactory implements GUIFactory {
	@Override
	public Button createButton() {
		return new WinButton();
	}

	@Override
	public Checkbox createCheckBox() {
		return new WinCheckbox();
	}
}
