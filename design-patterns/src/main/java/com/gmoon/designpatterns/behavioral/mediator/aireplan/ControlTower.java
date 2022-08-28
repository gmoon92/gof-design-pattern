package com.gmoon.designpatterns.behavioral.mediator.aireplan;

import com.gmoon.designpatterns.behavioral.mediator.pilot.Pilot;

// Mediator
public interface ControlTower {

	void notifyTakeOff(Pilot pilot, String message);
}
