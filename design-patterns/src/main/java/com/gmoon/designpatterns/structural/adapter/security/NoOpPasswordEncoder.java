package com.gmoon.designpatterns.structural.adapter.security;

public class NoOpPasswordEncoder implements PasswordEncoder {

	@Override
	public Password encode(String plainPassword) {
		return new Password("noop", plainPassword);
	}
}
