package com.gmoon.designpatterns.behavioral.templatemethod.file;

// Concrete Callback
public class Plus implements Operator {

	@Override
	public int getResult(int a, int b) {
		return a + b;
	}
}