package com.abc.sa.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Dog {
	public Dog() {
		log.info("dog constructor ..............");
	}

	@PostConstruct
	public void init() {
		log.info("dog init ..............");

	}

	@PreDestroy
	public void destroy() {
		log.info("dog destroy ..............");
	}

}
