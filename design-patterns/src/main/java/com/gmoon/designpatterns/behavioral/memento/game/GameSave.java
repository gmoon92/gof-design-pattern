package com.gmoon.designpatterns.behavioral.memento.game;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

// Memento
@RequiredArgsConstructor
@Getter
public final class GameSave {

	private final int score;
	private final int level;
}
