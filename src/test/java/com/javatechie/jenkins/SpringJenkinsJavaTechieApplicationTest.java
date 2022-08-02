package com.javatechie.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringJenkinsJavaTechieApplicationTest {
	
	public Logger logger =LoggerFactory.getLogger(SpringJenkinsJavaTechieApplicationTest.class);
	
	@Test
	void contextLoads() {
		logger.info("Inside Test method");
		assertEquals(true,true);
	}

}
