package com.gmoon.designpatterns.creational.builder;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class HouseDirector {
	private final HouseBuilder builder;

	public House defaultHouse() {
		return builder.windows(3)
		  .doors(2)
		  .rooms(3)
		  .getHouse();
	}

	public House hotel() {
		return builder.windows(3)
		  .doors(2)
		  .rooms(3)
		  .houseOption(true, true, true)
		  .getHouse();
	}
}
