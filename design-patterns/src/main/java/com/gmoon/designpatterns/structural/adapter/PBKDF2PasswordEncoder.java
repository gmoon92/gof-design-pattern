package com.gmoon.designpatterns.structural.adapter;

import com.gmoon.designpatterns.structural.adapter.hash.PBKDF2;
import com.gmoon.designpatterns.structural.adapter.security.Password;
import com.gmoon.designpatterns.structural.adapter.security.PasswordEncoder;

// adapter
public class PBKDF2PasswordEncoder
  implements PasswordEncoder { // target

	// adaptee
	private final PBKDF2 pbkdf2 = PBKDF2.INSTANCE;

	@Override
	public Password encode(String plainPassword) {
		String encodedPassword = pbkdf2.encode(plainPassword);
		return new Password("pbkdf2", encodedPassword);
	}
}
