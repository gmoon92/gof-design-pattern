package com.gmoon.designpatterns.behavioral.visitor.elment;

import com.gmoon.designpatterns.behavioral.visitor.visitor.Device;

// Concrete Element 1
public class Triangle implements Shape {

	@Override
	public void accept(Device device) {
		device.print(this);
	}
}
