package com.gmoon.designpatterns.structural.bridge;

import com.gmoon.designpatterns.structural.bridge.color.Blue;
import com.gmoon.designpatterns.structural.bridge.color.Red;
import com.gmoon.designpatterns.structural.bridge.shape.Circle;
import com.gmoon.designpatterns.structural.bridge.shape.Shape;
import com.gmoon.designpatterns.structural.bridge.shape.Square;

public class Application {
	public static void main(String[] args) {
		Shape square = new Square(new Red());
		square.print();

		Shape circle = new Circle(new Blue());
		circle.print();
	}
}
