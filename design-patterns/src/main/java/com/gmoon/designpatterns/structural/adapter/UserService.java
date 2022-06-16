package com.gmoon.designpatterns.structural.adapter;

import com.gmoon.designpatterns.structural.adapter.security.Password;
import com.gmoon.designpatterns.structural.adapter.security.PasswordEncoder;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class UserService {
	private final PasswordEncoder passwordEncoder;

	public void updatePassword(String rawPassword) {
		Password password = passwordEncoder.encode(rawPassword);
		System.out.println("update password... " + password.getPrefixEncodedPassword());
	}
}
