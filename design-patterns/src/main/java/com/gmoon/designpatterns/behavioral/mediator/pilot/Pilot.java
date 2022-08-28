package com.gmoon.designpatterns.behavioral.mediator.pilot;

import com.gmoon.designpatterns.behavioral.mediator.aireplan.ControlTower;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

// Colleague
@Getter
@RequiredArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public abstract class Pilot {

	protected final ControlTower controlTower;

	@EqualsAndHashCode.Include
	protected final String name;

	public void notifyFromControlTower(String message) {
		System.out.println(message);
	}

	public void takeOff() {
		controlTower.notifyTakeOff(this, "이륙 합니다.");
	}
}
