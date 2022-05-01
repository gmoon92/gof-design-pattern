package com.gmoon.designpatterns.creational.singleton;

import static org.assertj.core.api.Assertions.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SettingsTest {

	@Test
	@DisplayName("오직 하나의 인스턴스만 반환한다.")
	void testSingleton() {
		// given
		int numberOfThread = 10;
		ExecutorService service = Executors.newFixedThreadPool(numberOfThread);

		while (numberOfThread-- > 0) {
			service.execute(() -> {
				// when
				Settings settings = Settings.getInstance();

				// then
				assertThat(settings).isEqualTo(Settings.getInstance());
			});
		}
	}
}