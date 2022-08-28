package com.gmoon.designpatterns.behavioral.mediator;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.gmoon.designpatterns.behavioral.mediator.aireplan.AirportControlTower;
import com.gmoon.designpatterns.behavioral.mediator.aireplan.ControlTower;
import com.gmoon.designpatterns.behavioral.mediator.pilot.AsianaAirplane;
import com.gmoon.designpatterns.behavioral.mediator.pilot.KoreaAirplane;
import com.gmoon.designpatterns.behavioral.mediator.pilot.Pilot;

public class Application {

	public static void main(String[] args) {
		// Mediator
		ControlTower controlTower = new AirportControlTower();

		// Colleagues
		Pilot pilot1 = new KoreaAirplane(controlTower, "대한항공");
		Pilot pilot2 = new AsianaAirplane(controlTower, "아시아나항공");

		ExecutorService executorService = Executors.newFixedThreadPool(4);
		executorService.submit(pilot1::takeOff);
		executorService.submit(pilot2::takeOff);
		executorService.shutdown();
	}
}
