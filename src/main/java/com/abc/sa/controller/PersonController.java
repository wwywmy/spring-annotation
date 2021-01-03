package com.abc.sa.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.sa.bean.Color;
import com.abc.sa.bean.Person;
import com.abc.sa.util.SpringContextHolder;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/person")
@AllArgsConstructor
@Slf4j
@Import(Color.class)
public class PersonController {

//	private final Person person;

	@RequestMapping("/list")
	public Object list() {
		List<Person> list = new ArrayList<Person>();
//		list.add(person);

		ApplicationContext applicationContext = SpringContextHolder.getApplicationContext();
		list.add(applicationContext.getBean(Person.class));

		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String name : beanDefinitionNames) {
			if (name.contains(".") == false) {
				log.info(name);
			}

		}

		Environment environment = applicationContext.getEnvironment();
		String os = environment.getProperty("os.name");
		log.info(os);

		return list;
	}
}
