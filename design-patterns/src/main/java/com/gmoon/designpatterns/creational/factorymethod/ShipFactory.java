package com.gmoon.designpatterns.creational.factorymethod;

import org.apache.commons.lang3.StringUtils;

public class ShipFactory {

	public static Ship orderShip(String name, String email) {
		if (StringUtils.isBlank(name)) {
			throw new IllegalArgumentException("배 이름을 지어주세요.");
		}

		if (StringUtils.isBlank(email)) {
			throw new IllegalArgumentException("연락처를 남겨주세요.");
		}

		prepareFor(name);

		Ship ship = new Ship();
		ship.setName(name);

		// Customizing for specific name
		if (name.equalsIgnoreCase("whiteship")) {
			ship.setLogo("\uD83D\uDEE5️");
		} else if (name.equalsIgnoreCase("blackship")) {
			ship.setLogo("⚓");
		}

		// coloring
		if (name.equalsIgnoreCase("whiteship")) {
			ship.setColor("whiteship");
		} else if (name.equalsIgnoreCase("blackship")) {
			ship.setColor("black");
		}

		// notify
		sendEmailTo(email, ship);

		return ship;
	}

	private static void prepareFor(String name) {
		System.out.println(name + " 만들 준비 중");
	}

	private static void sendEmailTo(String email, Ship ship) {
		System.out.println(ship.getName() + " 다 만들었습니다.");
	}

}
