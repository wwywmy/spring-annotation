package com.abc.sa.controller;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.SneakyThrows;

@RestController
@RequestMapping("/db")
public class DbController {
	@Autowired
	private DataSource dataSourceMall;

	@RequestMapping("/id/{id}")
	@SneakyThrows
	public Object byId(@PathVariable String id) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("dataSource", dataSourceMall.toString());
		return map;
	}
}
