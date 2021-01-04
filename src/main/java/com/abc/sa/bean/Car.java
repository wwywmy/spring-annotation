package com.abc.sa.bean;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Car {
	public Car() {
		log.info("car constructor .........");
	}
	
	public void init() {
		log.info("car init .........");
	}
	
	public void destroy() {
		log.info("car destroy .........");
	}
}
