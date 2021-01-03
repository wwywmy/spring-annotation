package com.abc.sa.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.abc.sa.bean.Book;
import com.abc.sa.dao.BookDao;

@Service
public class BookService {

	@Resource
	private BookDao bookDao;
	
	public Book getBookBySn(String sn) {
		return bookDao.getBookBySn(sn);
	}
}
