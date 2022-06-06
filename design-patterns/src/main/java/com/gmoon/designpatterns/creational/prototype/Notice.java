package com.gmoon.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Notice implements Cloneable{
	private String title;
	private String content;
	private boolean enabled;
	private List<String> comments;

	// Copy Constructor
	public Notice(Notice that) {
		this.title = that.title;
		this.content = that.content;
		this.enabled = that.enabled;
		this.comments = new ArrayList<>(that.comments);
	}

	// Shallow Copy
	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	// Deep Copy
	public Notice deepCopy() {
		return new Notice(this);
	}
}
