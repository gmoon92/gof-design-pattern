package com.gmoon.designpatterns.behavioral.visitor.visitor;

import com.gmoon.designpatterns.behavioral.visitor.elment.Circle;
import com.gmoon.designpatterns.behavioral.visitor.elment.Triangle;

// Concrete Visitor 2
public class IPad implements Device {

	@Override
	public void print(Triangle triangle) {
		System.out.println("Print triangle to IPad.");
	}

	@Override
	public void print(Circle circle) {
		System.out.println("Print circle to IPad.");
	}
}
