package com.gmoon.designpatterns.behavioral.strategy.random;

import java.util.Random;

// Concrete Strategy 1
public class RandomMoveRule implements MoveRule {

	private static final Random RANDOM = new Random();

	private static final int MIN_OF_FORWARD_MOVE = 4;
	private static final int MIN_OF_RANDOM_NUMBER = 0;
	private static final int MAX_OF_RANDOM_NUMBER = 9;

	@Override
	public boolean isMovable() {
		return MIN_OF_FORWARD_MOVE <= generateRandomNumber();
	}

	private int generateRandomNumber() {
		return MIN_OF_RANDOM_NUMBER
		  + RANDOM.nextInt(MAX_OF_RANDOM_NUMBER - MIN_OF_RANDOM_NUMBER + 1);
	}
}
