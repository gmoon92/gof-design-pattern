package com.gmoon.designpatterns.creational.builder;

public interface HouseBuilder {

	HouseBuilder windows(int windows);

	HouseBuilder doors(int doors);

	HouseBuilder rooms(int rooms);

	HouseBuilder houseOption(Boolean hasGarage, Boolean hasSwimPool, Boolean hasStatues);

	House getHouse(); // builder();
}
