package com.gmoon.designpatterns.structural.bridge.old;

public class BlueCircle extends Shape {
	@Override
	String getColor() {
		return "blue";
	}

	@Override
	String getName() {
		return "circle";
	}
}
