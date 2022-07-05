package com.gmoon.designpatterns.structural.bridge.old;

public class RedCircle extends Shape {

	@Override
	String getColor() {
		return "red";
	}

	@Override
	String getName() {
		return "circle";
	}
}
