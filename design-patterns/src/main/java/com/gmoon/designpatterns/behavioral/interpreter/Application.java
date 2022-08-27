package com.gmoon.designpatterns.behavioral.interpreter;

import com.gmoon.designpatterns.behavioral.interpreter.notation.PostfixNotation;

public class Application {

	public static void main(String[] args) {
		PostfixNotation postfixNotation = new PostfixNotation("123+-");
		int sum = postfixNotation.calculate();

		System.out.println(sum);
	}
}
