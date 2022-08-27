package com.gmoon.designpatterns.behavioral.interpreter.notation;

import java.util.Stack;

public class PostfixNotation {

	private final String expression;

	public PostfixNotation(String expression) {
		this.expression = expression;
	}

	public int calculate() {
		Stack<Integer> numbers = new Stack<>();

		for (char c : this.expression.toCharArray()) {
			switch (c) {
				case '+':
					numbers.push(numbers.pop() + numbers.pop());
					break;
				case '-':
					int right = numbers.pop();
					int left = numbers.pop();
					numbers.push(left - right);
					break;
				default:
					numbers.push(Integer.parseInt(c + ""));
			}
		}

		return numbers.pop();
	}
}
