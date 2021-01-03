package com.abc.sa.dao;

import org.springframework.stereotype.Repository;

import com.abc.sa.bean.Book;

@Repository
public class BookDao {

	public Book getBookBySn(String sn) {
		return new Book(sn,"bk001","a001");
	}
}
