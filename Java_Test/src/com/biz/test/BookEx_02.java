package com.biz.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class BookEx_02 {

	public static void main(String[] args) {
		
		// bookvo를 담은 리스트를 선언하기
		// null값ㅇ르 할당한 상태
		// bookList를 사용할 수 없는 상태
		List<BookVO> bookList = null;
		
		//
		bookList = new ArrayList<BookVO>();
		
		for (int i = 0; i < 10; i++) {
			
			// List에 담을 객체를 생성
			BookVO bookVO = new BookVO();
			
			// 객체에 값ㅇ르 할당(저장)
			bookVO.setTile("Do it 자바");
			bookVO.setComp("이지즈퍼블리시");
			
			
			bookList.add(bookVO);
		}
		/*
		 * List객체 만들기
		 * java 문법상으로는 아무런 문제가 없지만
		 * 객체지향적인 패턵에서는 권하지 않는 방법
		 */
		ArrayList<BookVO> books = new ArrayList<BookVO>();
		/*
		 * 권장 패턴
		 * list 인터페이스로 선언하고
		 * 사용할객체로 초기화를 하자
		 * 어ㄸ너클래스를 만들때 
		 */
		List<BookVO> bookList2 = null;
		bookList2 = new ArrayList<BookVO>();
		bookList2 = new LinkedList<BookVO>();
		bookList2 = new Vector<BookVO>();
	}
}
