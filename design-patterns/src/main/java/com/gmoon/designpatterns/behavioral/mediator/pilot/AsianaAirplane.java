package com.gmoon.designpatterns.behavioral.mediator.pilot;

import com.gmoon.designpatterns.behavioral.mediator.aireplan.AirportControlTower;
import com.gmoon.designpatterns.behavioral.mediator.aireplan.ControlTower;

// Concrete Colleague 2
public class AsianaAirplane extends Pilot {

	public AsianaAirplane(String name) {
		this(new AirportControlTower(), name);
	}

	public AsianaAirplane(ControlTower controlTower, String name) {
		super(controlTower, name);
	}
}
