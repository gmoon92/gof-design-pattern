package com.gmoon.designpatterns.behavioral.iterator.social;

// Aggregate (IterableCollection)
public interface SocialNetwork {

	ProfileIterator createProfileIterator();
}
