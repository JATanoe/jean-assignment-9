package com.coderscampus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coderscampus.service.FileService;

@Configuration
public class WebConfig {
	
	@Bean 
	public FileService fileService () {
		return new FileService("recipes.txt");
	}

}
