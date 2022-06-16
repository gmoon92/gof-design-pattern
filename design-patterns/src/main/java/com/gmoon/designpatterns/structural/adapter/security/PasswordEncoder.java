package com.gmoon.designpatterns.structural.adapter.security;

public interface PasswordEncoder {
	Password encode(String plainPassword);
}
