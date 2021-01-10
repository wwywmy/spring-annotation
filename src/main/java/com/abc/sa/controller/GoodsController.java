package com.abc.sa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.sa.service.GoodsService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/goods")
@AllArgsConstructor
public class GoodsController {

	private final GoodsService goodsService;

	@RequestMapping("/list")
	public Object list() {

		return goodsService.list();
	}

	@RequestMapping("/save")
	public Object save() {

		return goodsService.save();
	}
}
