package com.gmoon.designpatterns.structural.adapter;

import com.gmoon.designpatterns.structural.adapter.security.NoOpPasswordEncoder;
import com.gmoon.designpatterns.structural.adapter.security.Password;
import com.gmoon.designpatterns.structural.adapter.security.PasswordEncoder;

import lombok.RequiredArgsConstructor;

public class Application {

	public static void main(String[] args) {
		PasswordEncoder passwordEncoder = new NoOpPasswordEncoder();

		UserService service = new UserService(passwordEncoder);

		String rawPassword = "gmoon";
		service.updatePassword(rawPassword);
	}

	@RequiredArgsConstructor
	static class UserService {
		private final PasswordEncoder passwordEncoder;

		public void updatePassword(String rawPassword) {
			Password password = passwordEncoder.encode(rawPassword);
			System.out.println("update password... " + password.getPrefixEncodedPassword());
		}
	}
}
