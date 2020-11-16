package com.sunsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan (basePackages= {"com.sunsoft.controller","com.sunsoft.dao","com.sunsoft.repository","com.sunsoft.model"})
public class SpringBootAssignment1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAssignment1Application.class, args);
	}

}
