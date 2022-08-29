package com.gmoon.designpatterns.behavioral.visitor.visitor;

import com.gmoon.designpatterns.behavioral.visitor.elment.Circle;
import com.gmoon.designpatterns.behavioral.visitor.elment.Triangle;

// Visitor
public interface Device {

	void print(Triangle triangle);

	void print(Circle circle);
}
