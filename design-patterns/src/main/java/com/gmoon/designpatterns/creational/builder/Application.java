package com.gmoon.designpatterns.creational.builder;

public class Application {
	public static void main(String[] args) {
		HouseBuilder builder = new DefaultHouseBuilder();
		HouseDirector director = new HouseDirector(builder);

		House house = director.defaultHouse();
		House houseWithGarage = director.hotel();
	}
}
