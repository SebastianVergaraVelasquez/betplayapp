package com.ligabetplay.betplayapp;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BetplayappApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(
			BetplayappApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8085"));
		app.run(args);
		//SpringApplication.run(BetplayAppApplication.class, args);
	}
	
	@Bean
    WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@SuppressWarnings("null")
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://localhost:4200","http://localhost",
				"http://localhost:8080").allowedMethods("*").allowedHeaders("*");
			}
		};
	}

}
