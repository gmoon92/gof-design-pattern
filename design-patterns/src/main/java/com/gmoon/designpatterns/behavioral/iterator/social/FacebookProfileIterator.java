package com.gmoon.designpatterns.behavioral.iterator.social;

import java.util.Iterator;
import java.util.List;

// Concrete iterator
public class FacebookProfileIterator implements ProfileIterator {

	private final Iterator<Profile> internalIterator;

	public FacebookProfileIterator(List<Profile> profiles) {
		sortDescendingByName(profiles);
		this.internalIterator = profiles.iterator();
	}

	private static void sortDescendingByName(List<Profile> profiles) {
		profiles.sort((p1, p2) -> p2.getName().compareTo(p1.getName()));
	}

	@Override
	public Profile getNext() {
		return internalIterator.next();
	}

	@Override
	public boolean hasNext() {
		return internalIterator.hasNext();
	}
}
