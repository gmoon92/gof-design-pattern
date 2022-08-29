package com.gmoon.designpatterns.behavioral.templatemethod.file;

// Callback
@FunctionalInterface
public interface Operator {

	int getResult(int a, int b);
}
