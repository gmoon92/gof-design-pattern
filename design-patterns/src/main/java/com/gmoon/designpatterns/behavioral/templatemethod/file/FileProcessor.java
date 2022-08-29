package com.gmoon.designpatterns.behavioral.templatemethod.file;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Stream;

import lombok.RequiredArgsConstructor;

// AbstractClass
@RequiredArgsConstructor
public abstract class FileProcessor {

	private final String path;

	public int process() {
		return process(null);
	}

	public int process(Operator operator) {
		try (
		  InputStream inputStream = getClass().getResourceAsStream(path);
		  InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		  BufferedReader reader = new BufferedReader(inputStreamReader);
		  Stream<String> lines = reader.lines()
		) {
			return lines
			  .mapToInt(Integer::parseInt)
			  .reduce((a, b) -> getResult(operator, a, b))
			  .orElse(0);
		} catch (Exception e) {
			throw new IllegalArgumentException(path + "에 해당하는 파일이 없습니다.", e);
		}
	}

	private int getResult(Operator operator, int a, int b) {
		boolean existsCallback = operator != null;
		if (existsCallback) {
			return operator.getResult(a, b);
		}

		return getResult(a, b);
	}

	// templateMethod
	protected abstract int getResult(int result, int number);
}
