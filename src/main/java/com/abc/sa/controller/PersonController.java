package com.abc.sa.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.sa.bean.Person;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/person")
@AllArgsConstructor
public class PersonController {
	
	private final Person person;
	
	@RequestMapping("/list")
	public Object list() {
		List<Person> list = new ArrayList<Person>();
		list.add(person);
		return list;
	}
}
