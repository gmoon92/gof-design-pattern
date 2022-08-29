package com.gmoon.designpatterns.behavioral.strategy;

import com.gmoon.designpatterns.behavioral.strategy.random.Car;
import com.gmoon.designpatterns.behavioral.strategy.random.MoveRule;
import com.gmoon.designpatterns.behavioral.strategy.random.RandomMoveRule;

// Client
public class Application {

	public static void main(String[] args) {
		Car car = new Car();

		MoveRule forwardMoveRule = () -> true;
		car.movable(forwardMoveRule);
		car.movable(new RandomMoveRule()); // 전진할 수도 안할 수도 있다.
	}
}
