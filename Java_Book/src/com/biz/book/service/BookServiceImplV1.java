package com.biz.book.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.Content;

import com.biz.book.domain.BookVO;

/*
 * BookService interface를 interfaces하여 작겅
 * 구체적인 메서드의 코드를 작성해야 한다.
 * 를  하면  레 저으이됨 메서드를 
 * 모두 하여 구현해야 하는 규칙이 적용이된다.
 * 
 * 를 수행한 다음에는 반드시
 * add unimplementn 메서드를 실행하여야 한다.
 */
public class BookServiceImplV1 implements BookService{
	List<BookVO> bookList;
	
	public BookServiceImplV1() {
		bookList = new ArrayList<BookVO>();
		
	}

	@Override
	public boolean inputBook() {
		/*
		 * 메서드의 지역변수로 선언을 하년 메서드의 수행이 끝나면
		 * 변수가 자동으로 해제되는 효과를 낼수 있다.
		 */
		Scanner scan = new Scanner(System.in);
		BookVO bookVO = new BookVO();
		
		System.out.print("도서명 >>");
		String strTitle = scan.nextLine();
		// 사용자가 도서명에 를 입력하면
		// 더이상 입력을 하지 않겠다라는 신호를
		// 호출한곳에 리턴
		if(strTitle.equals("END")) {
			return false;
		}
		bookVO.setTitle(strTitle);
		
		System.out.print("출판사 >>");
		String strComp = scan.nextLine();
		bookVO.setComp(strComp);
		
		System.out.print("저자 >>");
		String strWriter = scan.nextLine();
		bookVO.setWriter(strWriter);
		
		System.out.print("출판연도 >>");
		String strYear = scan.nextLine();
		int intYear = 0;
		try {
			intYear = Integer.valueOf(strYear);
		} catch (Exception e) {
			/*
			 * 만약 연도를 문자열로 잘못입력해서 오류가 발생할 경우
			 * 현재 입력하고 있는 도서정보를 도서명부터 다시 입력하도록 
			 */
			System.out.println("연도는 숫자만 가능");
			System.out.println(bookVO.getTitle()+"도서 정보부터 다시 입력하세요");
			return true;
		}
		bookVO.setYear(intYear);
		
		
		System.out.print("가격>>");
		String strPrice = scan.nextLine();
		int intPrice = 0;
		try {
			intPrice = Integer.valueOf(strPrice);
		} catch (Exception e) {
			System.out.println("가격은 숫자만 가능");
			System.out.println(bookVO.getTitle()+"도서 정보부터 다시 입력하세요");
			return true;
		}
		/*
		 * booklist.add 코드가 실행되기 전에
		 * 를 수행하면
		 * 현재 메서드가 실행되면서 입력했던
		 * 도서정보들이 아짓 에 추가되기 전이므로 
		 * 현재의 입력된 도서정보는 모두 무시되어 버린다
		 * 메인에서는 투루가 리턴 되었으므로 
		 * 아무런 판단없이 다시 입력을 수행하는 메서드를 호출하게 될 것이고
		 * 
		 * 리턴하기에
		 * 
		 */
		bookVO.setPrice(intPrice);
		bookList.add(bookVO);
		
		/*
		 * 모든 항목이 입력이 완료 되고 다음 도서정보를 입력 받겠다
		 * 라는 신호를 호출한곳에 리턴
		 */
		return true;
		
	}

	@Override
	public void booklist() {
		
		System.out.println("=============================================================================");
		System.out.println("책일람표");
		System.out.println("=============================================================================");
		System.out.println("제목\t출판사\t저자\t출판연도\t가격");
		System.out.println("-----------------------------------------------------------------------------");
		for (BookVO bVO : bookList) {
			System.out.print(bVO.getTitle()+"\t");
			System.out.print(bVO.getComp()+"\t");
			System.out.print(bVO.getWriter()+"\t");
			System.out.print(bVO.getYear()+"\t");
			System.out.print(bVO.getPrice()+"\n");
		}
		System.out.println("=============================================================================");
		
		
	}

}
