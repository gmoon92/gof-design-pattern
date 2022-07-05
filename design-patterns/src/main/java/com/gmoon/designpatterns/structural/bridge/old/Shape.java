package com.gmoon.designpatterns.structural.bridge.old;

public abstract class Shape {

	abstract String getColor();

	abstract String getName();

	public void print() {
		System.out.printf("%s %s\n", getColor(), getName());
	}
}
