package com.gmoon.designpatterns.creational.abstractfactory;

public class MacButton implements Button {
	@Override
	public void paint() {
		System.out.println("mac button paint.");
	}
}
