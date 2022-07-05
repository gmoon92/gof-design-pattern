package com.gmoon.designpatterns.structural.bridge.shape;

import com.gmoon.designpatterns.structural.bridge.color.Color;

public abstract class Shape {

	private final Color color;

	public Shape(Color color) {
		this.color = color;
	}

	abstract String getName();

	public void print() {
		System.out.printf("%s %s\n", color.getValue(), getName());
	}
}
