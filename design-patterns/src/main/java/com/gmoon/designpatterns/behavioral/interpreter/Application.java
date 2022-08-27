package com.gmoon.designpatterns.behavioral.interpreter;

import com.gmoon.designpatterns.behavioral.interpreter.expression.PostfixExpression;

public class Application {

	public static void main(String[] args) {
		Context context = Context.create()
		  .put('x', 1)
		  .put('y', 2)
		  .put('z', 3);

		PostfixExpression expression = PostfixParser.parse("xyz+-");
		int result = expression.interpret(context);
		System.out.println(result);
	}
}
