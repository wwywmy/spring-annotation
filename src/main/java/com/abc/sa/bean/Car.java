package com.abc.sa.bean;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class Car {
	private String name = "cn";

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
