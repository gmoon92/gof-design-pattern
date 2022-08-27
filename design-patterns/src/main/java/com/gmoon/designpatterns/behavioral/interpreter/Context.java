package com.gmoon.designpatterns.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Context {

	private final Map<Character, Integer> value = new HashMap<>();

	public static Context create() {
		return new Context();
	}

	public Context put(Character k, Integer v) {
		value.put(k, v);
		return this;
	}

	public Integer getValue(Character key) {
		return value.get(key);
	}
}
