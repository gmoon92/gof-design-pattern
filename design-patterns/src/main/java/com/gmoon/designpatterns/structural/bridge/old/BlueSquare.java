package com.gmoon.designpatterns.structural.bridge.old;

public class BlueSquare extends Shape {
	@Override
	String getColor() {
		return "blue";
	}

	@Override
	String getName() {
		return "square";
	}
}
