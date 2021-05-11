package com.example.servingwebcontent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServingWebContentApplication {

	private ServingWebContentApplication() {
		//Checkstyle wills so
	}
	
	public static void main(final String[] args) {
		SpringApplication.run(ServingWebContentApplication.class, args);
	}

}
