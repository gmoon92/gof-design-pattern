package com.gmoon.designpatterns.structural.bridge.shape;

import com.gmoon.designpatterns.structural.bridge.color.Color;

public class Square extends Shape {
	public Square(Color color) {
		super(color);
	}

	@Override
	String getName() {
		return "square";
	}
}
