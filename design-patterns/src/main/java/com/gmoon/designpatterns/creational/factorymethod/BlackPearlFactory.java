package com.gmoon.designpatterns.creational.factorymethod;

public class BlackPearlFactory implements ShipFactory {
	@Override
	public Ship createShip() {
		return new BlackPearl();
	}
}
