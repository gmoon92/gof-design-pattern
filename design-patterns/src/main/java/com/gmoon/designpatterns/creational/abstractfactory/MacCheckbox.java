package com.gmoon.designpatterns.creational.abstractfactory;

public class MacCheckbox implements Checkbox {
	@Override
	public void paint() {
		System.out.println("mac paint.");
	}
}
