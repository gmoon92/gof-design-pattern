package com.gmoon.designpatterns.creational.builder;

public class Application {
	public static void main(String[] args) {
		House house = new House(3, 2, 3, null, null, null);
		House houseWithGarage = new House(3, 2, 3, true, false, false);
	}
}
