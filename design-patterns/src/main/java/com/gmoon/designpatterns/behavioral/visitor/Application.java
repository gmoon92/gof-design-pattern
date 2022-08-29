package com.gmoon.designpatterns.behavioral.visitor;

import com.gmoon.designpatterns.behavioral.visitor.elment.Circle;
import com.gmoon.designpatterns.behavioral.visitor.elment.Shape;
import com.gmoon.designpatterns.behavioral.visitor.elment.Triangle;
import com.gmoon.designpatterns.behavioral.visitor.visitor.Device;
import com.gmoon.designpatterns.behavioral.visitor.visitor.IPad;
import com.gmoon.designpatterns.behavioral.visitor.visitor.IPhone;

// Client
public class Application {

	public static void main(String[] args) {
		// Double Dispatch 런타임시 두번 Dispatch 가 일어난다.
		// 1. accept: Shape#accept -> Triangle#accept
		// 2. visit : Device#print -> IPhone#print
		Shape triangle = new Triangle();
		Device iPhone = new IPhone();
		triangle.accept(iPhone);

		Shape circle = new Circle();
		Device iPad = new IPad();
		circle.accept(iPad);
	}
}
