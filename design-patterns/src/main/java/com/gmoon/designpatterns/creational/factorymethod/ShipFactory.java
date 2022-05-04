package com.gmoon.designpatterns.creational.factorymethod;

import org.apache.commons.lang3.StringUtils;

public interface ShipFactory {

	Ship createShip();

	default Ship orderShip(String name, String email) {
		validation(name, email);
		prepareFor(name);
		Ship ship = createShip();
		sendEmailTo(email, ship);
		return ship;
	}

	default void validation(String name, String email) {
		if (StringUtils.isBlank(name)) {
			throw new IllegalArgumentException("배 이름을 지어주세요.");
		}

		if (StringUtils.isBlank(email)) {
			throw new IllegalArgumentException("연락처를 남겨주세요.");
		}
	}

	default void prepareFor(String name) {
		System.out.println(name + " 만들 준비 중");
	}

	default void sendEmailTo(String email, Ship ship) {
		System.out.println(ship.getName() + " 다 만들었습니다.");
	}
}
