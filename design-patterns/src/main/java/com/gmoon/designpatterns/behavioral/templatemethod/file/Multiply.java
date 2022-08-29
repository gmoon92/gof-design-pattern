package com.gmoon.designpatterns.behavioral.templatemethod.file;

// ConcreteClass
public class Multiply extends FileProcessor {

	public Multiply(String path) {
		super(path);
	}

	@Override
	protected int getResult(int number1, int number2) {
		return number1 * number2;
	}
}
