package com.gmoon.designpatterns.creational.factorymethod;

public class Client {

	public static void main(String[] args) {
		Client client = new Client();
		client.print(new WhiteShipFactory(), "Whiteship", "keesun@mail.com");
		client.print(new BlackPearlFactory(), "Blackship", "keesun@mail.com");
	}

	private void print(ShipFactory factory, String name, String email) {
		System.out.println(factory.orderShip(name, email));
	}
}
