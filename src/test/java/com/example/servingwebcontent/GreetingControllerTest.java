package com.example.servingwebcontent;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

@SpringBootTest
class GreetingControllerTest {

	@Autowired
	private GreetingController controller;
	
	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}
	
	@Test
	void testgreeting() {
		Model model = new ConcurrentModel();
		assertThat(controller.greeting("Werner", model)).isNotNull().isEqualTo("greeting");
		assertThat(model.getAttribute("name")).isNotNull().isEqualTo("Werner");
		
	}

}
