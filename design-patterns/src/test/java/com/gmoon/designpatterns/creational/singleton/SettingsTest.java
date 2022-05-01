package com.gmoon.designpatterns.creational.singleton;

import static org.assertj.core.api.Assertions.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
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

	@Test
	@DisplayName("싱글톤 구조 깨트리기 - 리플렉션 사용")
	void testBrokenSingletonPattern_Reflection() throws Exception {
		// when
		Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		Settings settings = constructor.newInstance();

		// then
		assertThat(settings).isNotEqualTo(Settings.getInstance());
	}

	@Test
	@DisplayName("싱글톤 구조 깨트리기 - 직렬화 & 역직렬화를 사용")
	void testBrokenSingletonPattern_Serializable() throws Exception {
		// given
		Settings settings = Settings.getInstance();
		String filePath = "src/test/resources/tmp/settings.obj";
		try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream(filePath))){
			out.writeObject(settings);
		}

		// when then
		try (ObjectInput in = new ObjectInputStream(new FileInputStream(filePath))){
			Settings read = (Settings)in.readObject();
			assertThat(settings).isNotEqualTo(read);
		}
	}
}
