package com.gmoon.designpatterns.behavioral.interpreter.expression;

import com.gmoon.designpatterns.behavioral.interpreter.Context;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MinusExpression implements PostfixExpression {

	private final PostfixExpression left, right;

	@Override
	public int interpret(Context context) {
		return left.interpret(context) - right.interpret(context);
	}
}
