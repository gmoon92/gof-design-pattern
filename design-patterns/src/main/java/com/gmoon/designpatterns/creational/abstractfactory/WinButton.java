package com.gmoon.designpatterns.creational.abstractfactory;

public class WinButton implements Button {
	@Override
	public void paint() {
		System.out.println("win button paint.");
	}
}
