package com.abc.sa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.abc.sa.bean.Dog;

@Configuration
public class DogConfig {

	@Bean
	public Dog getDog() {
		return new Dog();
	}

}
