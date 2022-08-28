package com.gmoon.designpatterns.behavioral.iterator;

import java.util.Arrays;

import com.gmoon.designpatterns.behavioral.iterator.social.Facebook;
import com.gmoon.designpatterns.behavioral.iterator.social.Profile;
import com.gmoon.designpatterns.behavioral.iterator.social.ProfileIterator;
import com.gmoon.designpatterns.behavioral.iterator.social.SocialNetwork;

public class Application {

	public static void main(String[] args) {
		// Aggregate
		SocialNetwork socialNetwork = new Facebook(Arrays.asList(
		  new Profile("gmoon"),
		  new Profile("back"),
		  new Profile("kim"),
		  new Profile("lee"),
		  new Profile("ahea")
		));

		// iterator
		ProfileIterator iterator = socialNetwork.createProfileIterator();
		while (iterator.hasNext()) {
			Profile profile = iterator.getNext();
			System.out.println("profile name: " + profile.getName());
		}
	}
}
