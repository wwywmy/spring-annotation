package com.abc.sa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.abc.sa.bean.Cat;

@Configuration
public class CatConfig {

	@Bean
	public Cat getCat() {
		return new Cat();
	}

}
