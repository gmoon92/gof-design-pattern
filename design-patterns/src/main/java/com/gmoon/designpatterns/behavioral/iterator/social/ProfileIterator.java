package com.gmoon.designpatterns.behavioral.iterator.social;

import java.util.Iterator;

// Iterator
public interface ProfileIterator extends Iterator<Profile> {

	Profile getNext();

	boolean hasNext();

	@Override
	default Profile next() {
		return getNext();
	}
}
