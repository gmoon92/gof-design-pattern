package com.gmoon.designpatterns.behavioral.strategy.random;

// Context
public class Car {

	public void movable(MoveRule moveRule) {
		if (moveRule.isMovable()) {
			System.out.println("자동차는 전진 한다.");
		}
	}
}
