package com.gmoon.designpatterns.creational.builder;

public class HotelBuilder implements HouseBuilder{
	private int windows;
	private int doors;
	private int rooms;
	private Boolean hasSwimPool;
	private Boolean hasStatues;
	
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
		this.hasSwimPool = hasSwimPool;
		this.hasStatues = hasStatues;
		return this;
	}

	@Override
	public House getHouse() {
		return new House(windows, doors, rooms, true, hasSwimPool, hasStatues);
	}
}
