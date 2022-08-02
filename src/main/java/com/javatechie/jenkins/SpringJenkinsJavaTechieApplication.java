package com.javatechie.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringJenkinsJavaTechieApplication {
	
	public static Logger logger =LoggerFactory.getLogger(SpringJenkinsJavaTechieApplication.class);
	
	public void init() {
		logger.info("Inside Init method");
	}
	
	public static void main(String[] args) {
		logger.info("Inside Spring Application");
		SpringApplication.run(SpringJenkinsJavaTechieApplication.class, args);
		display();
	}

	public static void display() {
		System.out.println(" Running SpringBoot Application");
	}

}
