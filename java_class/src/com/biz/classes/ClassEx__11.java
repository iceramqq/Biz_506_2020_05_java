package com.biz.classes;

import com.biz.classes.model.BookVO;
import com.biz.classes.service.BookService;

public class ClassEx__11 {
	
	public static void main(String[] args) {
		
		BookVO[] bookList=new BookVO[3];
		
		bookList[0]=new BookVO();
		bookList[1]=new BookVO();
		bookList[2]=new BookVO();
		
		bookList[0].isbn="001";
		bookList[1].isbn="002";
		bookList[2].isbn="003";
		
		bookList[0].title="자바입문";
				
		bookList[0].auth="박은종";
		
		bookList[0].comp="이지스퍼블릭";
		
		bookList[0].price=35000;
		
		BookService bookService=new BookService();
		bookService.bookinfo(bookList[0]);
		
		
		
		
		
	}

}
