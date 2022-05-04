package com.gmoon.designpatterns.creational.factorymethod;

public class WhiteShipFactory implements ShipFactory {
	@Override
	public Ship createShip() {
		return new WhiteShip();
	}
}
