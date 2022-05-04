package com.gmoon.designpatterns.creational.factorymethod;

public class Client {

	public static void main(String[] args) {
		Ship whiteship = new WhiteShipFactory().orderShip("Whiteship", "keesun@mail.com");
		System.out.println(whiteship);

		Ship blackship = new BlackPearlFactory().orderShip("Blackship", "keesun@mail.com");
		System.out.println(blackship);
	}

}
