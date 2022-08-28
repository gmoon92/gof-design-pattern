package com.gmoon.designpatterns.behavioral.mediator.pilot;

import com.gmoon.designpatterns.behavioral.mediator.aireplan.AirportControlTower;
import com.gmoon.designpatterns.behavioral.mediator.aireplan.ControlTower;

// ConcreteColleague 1
public class KoreaAirplane extends Pilot {

	public KoreaAirplane(String name) {
		this(new AirportControlTower(), name);
	}

	public KoreaAirplane(ControlTower controlTower, String name) {
		super(controlTower, name);
	}
}
