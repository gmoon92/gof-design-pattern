package com.gmoon.designpatterns.creational.abstractfactory;

public class WinCheckbox implements Checkbox {
	@Override
	public void paint() {
		System.out.println("win paint.");
	}
}
