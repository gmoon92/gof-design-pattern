package com.gmoon.designpatterns.behavioral.visitor.elment;

import com.gmoon.designpatterns.behavioral.visitor.visitor.Device;

// Concrete Element 2
public class Circle implements Shape {

	@Override
	public void accept(Device device) {
		device.print(this);
	}
}
