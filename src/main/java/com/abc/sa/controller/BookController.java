package com.abc.sa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.sa.service.BookService;
import com.abc.sa.util.SpringContextHolder;

@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	private BookService bookService;
	
	@RequestMapping("/list")
	public Object list() {
		
		ApplicationContext applicationContext = SpringContextHolder.getApplicationContext();
		BookService bks = applicationContext.getBean(BookService.class);
		
		return bks.getBookBySn("112233");
	}
	
	@RequestMapping("/sn/{sn}")
	public Object bySn(@PathVariable String sn) {
		return  bookService.getBookBySn(sn);
	}
}
