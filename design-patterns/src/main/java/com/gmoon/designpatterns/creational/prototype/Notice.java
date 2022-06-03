package com.gmoon.designpatterns.creational.prototype;

import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode
public class Notice {
	private String title;
	private String content;
	private boolean enabled;
	private List<String> comments;
}
