package com.abc.sa.service;

import javax.annotation.Resource;

import org.apache.commons.lang3.RandomUtils;
import org.springframework.stereotype.Service;

import com.abc.sa.bean.Book;
import com.abc.sa.dao.BookDao;

@Service
public class BookService {

	@Resource
	private BookDao bookDao;

	public Book getBookBySn(String sn) {
		if (RandomUtils.nextBoolean() == false) {
			throw new RuntimeException("服务异常");
		}
		return bookDao.getBookBySn(sn);
	}
}
