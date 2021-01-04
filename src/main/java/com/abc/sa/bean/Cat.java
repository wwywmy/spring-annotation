package com.abc.sa.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Cat implements InitializingBean, DisposableBean {
	public Cat() {
		log.info("cat constructor ..............");
	}

	@Override
	public void destroy() throws Exception {
		log.info("cat destroy ..............");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		log.info("cat afterPropertiesSet ..............");

	}
}
