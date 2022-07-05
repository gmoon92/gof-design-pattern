package com.gmoon.designpatterns.structural.bridge.old;

public class RedSquare extends Shape {
	@Override
	String getColor() {
		return "red";
	}

	@Override
	String getName() {
		return "square";
	}
}
