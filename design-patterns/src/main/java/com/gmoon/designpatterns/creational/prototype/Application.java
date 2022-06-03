package com.gmoon.designpatterns.creational.prototype;

import java.util.Arrays;

public class Application {
	public static void main(String[] args) {
		Notice notice = new Notice();
		notice.setTitle("제목");
		notice.setContent("내용");
		notice.setEnabled(false);
		notice.setComments(Arrays.asList("댓글1", "댓글2"));

		Notice clone = new Notice();
		clone.setTitle(notice.getTitle());
		clone.setContent(notice.getContent());
		clone.setEnabled(notice.isEnabled());
		clone.setComments(notice.getComments());

		// clone 특징
		assert notice != clone;
		assert notice.equals(clone);
	}
}
