package com.abc.sa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.abc.sa.bean.Person;
import com.abc.sa.condition.LinuxCondition;
import com.abc.sa.condition.WindowsCondition;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class PersonConfig {

////	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//	@Bean("person")
////	@Lazy
//	public Person getPerson() {
//		Person person = new Person("张三",30);
//		log.info(person.toString());
//		return person;
//	}
	
	@Bean("bill")
	@Conditional(WindowsCondition.class)
	public Person getPerson2() {
		Person person = new Person("bill gates",60);
		log.info(person.toString());
		return person;
	}
	
	@Bean("linus")
	@Conditional(LinuxCondition.class)
	public Person getPerson3() {
		Person person = new Person("linus",58);
		log.info(person.toString());
		return person;
	}
}
