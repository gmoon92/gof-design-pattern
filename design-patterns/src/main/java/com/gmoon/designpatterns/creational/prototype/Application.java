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
		notice.setComments(new ArrayList<>(Arrays.asList("댓글1", "댓글2")));


		// shallow copied
		Notice clone = (Notice)notice.clone();
		assert isEqualsSystemHashCode(notice.getTitle(), clone.getTitle());
		assert isEqualsSystemHashCode(notice.getContent(), clone.getContent());
		assert isEqualsSystemHashCode(notice.isEnabled(), clone.isEnabled());

		assertCopiedObject(notice, clone);
		assertShallowCopiedObject(notice, clone);

		// deep copied
		Notice deepCopied = notice.deepCopy();
		assertCopiedObject(notice, deepCopied);
		assertDeepCopiedObject(notice, deepCopied);
	}

	private static void assertCopiedObject(Object origin, Object clone) {
		assert origin != clone;
		assert origin.equals(clone);
		assert origin.getClass() == origin.getClass();
	}

	private static void assertDeepCopiedObject(Notice notice, Notice clone) {
		notice.setTitle("제목 수정");
		notice.setContent("내용 수정");
		notice.setEnabled(false);
		assert isEqualsSystemHashCode(notice.getTitle(), clone.getTitle());
		assert isEqualsSystemHashCode(notice.getContent(), clone.getContent());
		assert isEqualsSystemHashCode(notice.isEnabled(), clone.isEnabled());

		List<String> noticeComments = notice.getComments();
		String newComment = "신규 댓글";
		noticeComments.add(newComment);

		assert !isEqualsSystemHashCode(notice.getComments(), clone.getComments());
		assert !clone.getComments().contains(newComment);
	}

	// shallow copy 참조 타입 검증
	private static void assertShallowCopiedObject(Notice notice, Notice clone) {
		notice.setTitle("제목 수정");
		notice.setContent("내용 수정");
		notice.setEnabled(false);
		assert !isEqualsSystemHashCode(notice.getTitle(), clone.getTitle());
		assert !isEqualsSystemHashCode(notice.getContent(), clone.getContent());
		assert !isEqualsSystemHashCode(notice.isEnabled(), clone.isEnabled());

		// 참조 타입 주소 값을 복사하기 때문에 원본 객체와 복사된 객체간 공유한다.
		// 복사된 참조 타입 데이터를 수정시 원본 Object 데이터도 변경 위험이 따른다.
		List<String> noticeComments = notice.getComments();
		String newComment = "신규 댓글";
		noticeComments.add(newComment);
		assert isEqualsSystemHashCode(notice.getComments(), clone.getComments());
		assert clone.getComments().contains(newComment);
	}

	private static boolean isEqualsSystemHashCode(Object o1, Object o2) {
		return System.identityHashCode(o1) == System.identityHashCode(o2);
	}
}
