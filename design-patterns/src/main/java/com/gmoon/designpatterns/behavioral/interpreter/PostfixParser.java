package com.gmoon.designpatterns.behavioral.interpreter;

import java.util.Stack;

import com.gmoon.designpatterns.behavioral.interpreter.expression.MinusExpression;
import com.gmoon.designpatterns.behavioral.interpreter.expression.PlusExpression;
import com.gmoon.designpatterns.behavioral.interpreter.expression.PostfixExpression;
import com.gmoon.designpatterns.behavioral.interpreter.expression.VariableExpression;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class PostfixParser {

	public static PostfixExpression parse(String expression) {
		Stack<PostfixExpression> stack = new Stack<>();
		for (char c : expression.toCharArray()) {
			stack.push(getExpression(c, stack));
		}

		return stack.pop();
	}

	private static PostfixExpression getExpression(char c, Stack<PostfixExpression> stack) {
		switch (c) {
			case '+':
				return new PlusExpression(stack.pop(), stack.pop());
			case '-':
				PostfixExpression right = stack.pop();
				PostfixExpression left = stack.pop();
				return new MinusExpression(left, right);
			default:
				return new VariableExpression(c);
		}
	}
}
