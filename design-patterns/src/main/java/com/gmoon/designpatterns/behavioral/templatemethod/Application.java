package com.gmoon.designpatterns.behavioral.templatemethod;

import com.gmoon.designpatterns.behavioral.templatemethod.file.FileProcessor;
import com.gmoon.designpatterns.behavioral.templatemethod.file.Multiply;
import com.gmoon.designpatterns.behavioral.templatemethod.file.Plus;

// Client
public class Application {

	public static void main(String[] args) {
		// 1,1,1
		FileProcessor fileProcessor = new Multiply("/number.txt");

		assert fileProcessor.process() == 1;
		assert fileProcessor.process(new Plus()) == 3; // callback
	}
}
