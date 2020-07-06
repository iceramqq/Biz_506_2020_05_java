package com.biz.book.domain;

/*
 * 도서정보를 저장할 클래스
 * 도서명, 출판사, 저자, 출판연도, 가격 필드 포함
 * 츨판년도는 나중에 4칙연산을 수행할 것을 대비 해서 int형으로 변수선언
 */
public class BookVO {
	
	private String title = "자바의 정석";
	private String comp = "도우출판";
	private String writer = "남궁성";
	private int year = 2016;
	private int price = 3000;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getComp() {
		return comp;
	}
	public void setComp(String comp) {
		this.comp = comp;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
