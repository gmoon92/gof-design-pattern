package com.gmoon.designpatterns.behavioral.interpreter.expression;

import com.gmoon.designpatterns.behavioral.interpreter.Context;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class VariableExpression implements PostfixExpression {

	private final Character variable;

	@Override
	public int interpret(Context context) {
		return context.getValue(variable);
	}
}
