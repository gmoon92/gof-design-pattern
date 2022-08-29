package com.gmoon.designpatterns.behavioral.visitor.elment;

import com.gmoon.designpatterns.behavioral.visitor.visitor.Device;

// Element
public interface Shape {

	void accept(Device device);
}
