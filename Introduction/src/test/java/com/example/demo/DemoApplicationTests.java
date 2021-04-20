package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {
	TestRestTemplate restTemplate = new TestRestTemplate();

	@LocalServerPort
	int port;

	@Test
	void test_jupiter() {
		assertEquals(restTemplate.getForObject("http://localhost:" + port, String.class), "Hello World! in DemoApplication.java");
	}
	
	@Test
	void test_hamcrest() {
		assertThat(restTemplate.getForObject("http://localhost:" + port, String.class), is("Hello World! in DemoApplication.java"));
	}

	@Test
	void test_assertj() {
		assertThat(restTemplate.getForObject("http://localhost:" + port, String.class)).isEqualTo("Hello World! in DemoApplication.java");
	}
}
