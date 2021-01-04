package com.abc.sa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.abc.sa.bean.Car;

@Configuration
public class CarConfig {

	@Bean(initMethod = "init", destroyMethod = "destroy")
	public Car getCar() {
		return new Car();
	}

}
