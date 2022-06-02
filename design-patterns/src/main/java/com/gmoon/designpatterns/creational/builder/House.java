package com.gmoon.designpatterns.creational.builder;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class House {
	private int windows;
	private int doors;
	private int rooms;
	private Boolean hasGarage;
	private Boolean hasSwimPool;
	private Boolean hasStatues;

	public House(int windows, int doors, int rooms, Boolean hasGarage, Boolean hasSwimPool, Boolean hasStatues) {
		this.windows = windows;
		this.doors = doors;
		this.rooms = rooms;
		this.hasGarage = hasGarage;
		this.hasSwimPool = hasSwimPool;
		this.hasStatues = hasStatues;
	}
}
