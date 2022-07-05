package com.gmoon.designpatterns.structural.bridge;

import com.gmoon.designpatterns.structural.bridge.old.BlueSquare;
import com.gmoon.designpatterns.structural.bridge.old.RedCircle;
import com.gmoon.designpatterns.structural.bridge.old.Shape;

public class Application {
	public static void main(String[] args) {
		Shape circle = new RedCircle();
		circle.print();

		Shape square = new BlueSquare();
		square.print();
	}
}
