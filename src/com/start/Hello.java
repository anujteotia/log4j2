package com.start;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Hello {
	public final static Logger logger = LogManager.getLogger(Hello.class);
	public static void main(String[] args) {
		logger.info("Hello World!!!");
		logger.info("Let's begin!!!!!");
	}

}
	
