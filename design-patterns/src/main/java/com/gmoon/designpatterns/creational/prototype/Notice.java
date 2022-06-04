package com.gmoon.designpatterns.creational.prototype;

import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode
public class Notice implements Cloneable{
	private String title;
	private String content;
	private boolean enabled;
	private List<String> comments;

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
