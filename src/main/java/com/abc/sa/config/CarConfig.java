package com.abc.sa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.abc.sa.bean.Car;

@Configuration
public class CarConfig {

	@Scope("prototype")
	@Bean(initMethod = "init", destroyMethod = "destroy")
//	@Bean
	public Car getCar() {
		Car car = new Car();
		car.setName("BMW");
		return car;
	}

}
