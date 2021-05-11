package com.example.servingwebcontent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
 * HideUtilityClassConstructorCheck
 */
@SuppressWarnings("HideUtilityClassConstructorCheck")
@SpringBootApplication
public class ServingWebContentApplication {

	/**
	 * Main Method.
	 * 
	 * @param args Arguments
	 */
	public static void main(final String[] args) {
		SpringApplication.run(ServingWebContentApplication.class, args);
	}

}
