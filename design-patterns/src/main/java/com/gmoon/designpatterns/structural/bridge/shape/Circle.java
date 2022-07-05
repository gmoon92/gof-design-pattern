package com.gmoon.designpatterns.structural.bridge.shape;

import com.gmoon.designpatterns.structural.bridge.color.Color;

public class Circle extends Shape {
	public Circle(Color color) {
		super(color);
	}

	@Override
	String getName() {
		return "circle";
	}
}
