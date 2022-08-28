package com.gmoon.designpatterns.behavioral.mediator.aireplan;

import java.util.LinkedList;
import java.util.Queue;

import com.gmoon.designpatterns.behavioral.mediator.pilot.Pilot;

import lombok.RequiredArgsConstructor;

// Concrete Mediator
@RequiredArgsConstructor
public class AirportControlTower implements ControlTower {

	private final Queue<Pilot> waitingLine = new LinkedList<>();

	@Override
	public void notifyTakeOff(Pilot pilot, String message) {
		System.out.format("%s: %s\n", pilot.getName(), message);
		addWaitingLine(pilot);

		takeOff(pilot);
	}

	private void takeOff(Pilot pilot) {
		Pilot waitedPilot = waitingLine.peek();
		String pilotName = pilot.getName();

		boolean doFlying = waitedPilot.equals(pilot);
		if (doFlying) {
			waitingLine.remove(pilot);
			sendMessageForPilot(pilot, "진행하세요.");
			sendMessageForWaitingPilots(String.format("%s 님이 진행중에 있습니다.", pilotName));
		} else {
			sendMessageForPilot(pilot, "대기해주세요.");
		}

	}

	private void sendMessageForWaitingPilots(String message) {
		for (Pilot p : waitingLine) {
			sendMessageForPilot(p, message);
		}
	}

	private void sendMessageForPilot(Pilot pilot, String message) {
		pilot.notifyFromControlTower(String.format("공항: %s", message));
	}

	private void addWaitingLine(Pilot pilot) {
		waitingLine.add(pilot);
	}
}
