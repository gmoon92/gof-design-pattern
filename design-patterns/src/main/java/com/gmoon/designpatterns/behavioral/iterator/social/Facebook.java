package com.gmoon.designpatterns.behavioral.iterator.social;

import java.util.List;

// ConcreteAggregate (ConcreteCollection)
public class Facebook implements SocialNetwork {

	private final List<Profile> profiles;

	public Facebook(List<Profile> profiles) {
		this.profiles = profiles;
	}

	// createIterator(): Iterator
	@Override
	public ProfileIterator createProfileIterator() {
		return new FacebookProfileIterator(profiles);
	}
}
