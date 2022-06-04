package com.gmoon.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
	public static void main(String[] args) {
		Notice notice = new Notice();
		notice.setTitle("제목");
		notice.setContent("내용");
		notice.setEnabled(true);

		List<String> comments = new ArrayList<>(Arrays.asList("댓글1", "댓글2"));
		notice.setComments(comments);

		Notice clone = new Notice();
		clone.setTitle(notice.getTitle());
		clone.setContent(notice.getContent());
		clone.setEnabled(notice.isEnabled());
		clone.setComments(notice.getComments());

		// clone
		assert notice != clone;
		assert notice.equals(clone);

		// shallow copy
		assert notice.getTitle() == clone.getTitle();
		assert notice.getContent() == clone.getContent();
		assert notice.isEnabled() == clone.isEnabled();

		// shallow copy 참조 복사 검증
		notice.setTitle("제목 수정");
		notice.setContent("내용 수정");
		notice.setEnabled(false);
		assert notice.getTitle() != clone.getTitle();
		assert notice.getContent() != clone.getContent();
		assert notice.isEnabled() != clone.isEnabled();

		List<String> noticeComments = notice.getComments();
		String newComment = "신규 댓글";
		noticeComments.add(newComment);
		assert notice.getComments() == clone.getComments();
		assert clone.getComments().contains(newComment);
	}
}
