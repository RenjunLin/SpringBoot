package com.jerry.springboot;

import com.jerry.springboot.controller.StudentController;
import com.jerry.springboot.properties.SchoolProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringbootApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringbootApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
