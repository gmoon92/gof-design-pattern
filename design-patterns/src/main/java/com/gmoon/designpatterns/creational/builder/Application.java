package com.gmoon.designpatterns.creational.builder;

public class Application {
	public static void main(String[] args) {
		HouseBuilder builder = new DefaultHouseBuilder();
		House house = builder.windows(3)
		  .doors(2)
		  .rooms(3)
		  .getHouse();

		HouseBuilder hotelBuilder = new HotelBuilder();
		House houseWithGarage = hotelBuilder.windows(3)
		  .doors(2)
		  .rooms(3)
		  .houseOption(true, true, true)
		  .getHouse();
	}
}
