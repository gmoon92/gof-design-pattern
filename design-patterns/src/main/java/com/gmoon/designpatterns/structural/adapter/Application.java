package com.gmoon.designpatterns.structural.adapter;

import com.gmoon.designpatterns.structural.adapter.security.NoOpPasswordEncoder;
import com.gmoon.designpatterns.structural.adapter.security.PasswordEncoder;

public class Application {

	public static void main(String[] args) {
		// target
		PasswordEncoder passwordEncoder = new NoOpPasswordEncoder();

		// client
		UserService service = new UserService(passwordEncoder);

		String rawPassword = "gmoon";
		service.updatePassword(rawPassword);
	}
}
