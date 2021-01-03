package com.abc.sa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.abc.sa.bean.Person;

@Configuration
public class PersonConfig {

	@Bean
	public Person getPerson() {
		Person person = new Person("张三",30);
		return person;
	}
}
