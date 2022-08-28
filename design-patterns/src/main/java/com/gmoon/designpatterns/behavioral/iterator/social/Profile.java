package com.gmoon.designpatterns.behavioral.iterator.social;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Profile {

	private String id;
	private String name;
	private LocalDateTime createdDateTime;

	public Profile(String name) {
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.createdDateTime = LocalDateTime.now();
	}
}
