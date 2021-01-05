package com.abc.sa.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.sa.bean.Boss;
import com.abc.sa.bean.Color;

@RestController
@RequestMapping("/boss")
public class BossController {
	@Autowired
	private Boss boss;
	@Autowired
	private Color color;

	@RequestMapping("/id/{id}")
	public Object byId(@PathVariable String id) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("boss", boss);
		map.put("color", color);
		return map;
	}
}
