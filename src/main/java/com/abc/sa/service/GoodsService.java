package com.abc.sa.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abc.sa.bean.Goods;
import com.abc.sa.mapper.GoodsMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.javafaker.Faker;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.RandomUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Administrator
 * EnableTransactionManagement
 * BeanFactoryPostProcessor
 * BeanDefinitionRegistryPostProcessor
 */
@Service
@Slf4j
public class GoodsService {

	@Resource
	private GoodsMapper goodsMapper;

	public List<Goods> list() {

		QueryWrapper<Goods> queryWrapper = new QueryWrapper<Goods>();

		return goodsMapper.selectList(queryWrapper);
	}

	@Transactional
	public boolean save() {
		Faker faker = new Faker();

//		String name = faker.name().fullName(); // Miss Samanta Schmidt
		String firstName = faker.name().firstName(); // Emory
//		String lastName = faker.name().lastName(); // Barton
//
//		String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449

		Goods goods = new Goods();
		goods.setName("GOODS " + firstName);
		goods.setGoodsDesc(DateUtil.now());

		int insertCount = goodsMapper.insert(goods);

		int i = RandomUtil.randomInt(0, 1 + 1);
		log.info("i={}", i);
		int m = 10 / i;
		log.info("m={}", m);

		return (insertCount > 0) ? true : false;
	}
}
