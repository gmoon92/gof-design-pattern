package com.gmoon.designpatterns.creational.builder;

public class DefaultHouseBuilder implements HouseBuilder{
	private int windows;
	private int doors;
	private int rooms;

	@Override
	public HouseBuilder windows(int windows) {
		this.windows = windows;
		return this;
	}

	@Override
	public HouseBuilder doors(int doors) {
		this.doors = doors;
		return this;
	}

	@Override
	public HouseBuilder rooms(int rooms) {
		this.rooms = rooms;
		return this;
	}

	@Override
	public HouseBuilder houseOption(Boolean hasGarage, Boolean hasSwimPool, Boolean hasStatues) {
		throw new IllegalArgumentException("Default House 는 옵션을 설정할 수 없다.");
	}

	@Override
	public House getHouse() {
		return new House(windows, doors, rooms, false, false, false);
	}
}
