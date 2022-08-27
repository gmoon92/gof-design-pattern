package com.gmoon.designpatterns.behavioral.interpreter.expression;

import com.gmoon.designpatterns.behavioral.interpreter.Context;

@FunctionalInterface
public interface PostfixExpression {

	int interpret(Context context);
}
