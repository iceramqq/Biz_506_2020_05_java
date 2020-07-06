package com.biz.book.service;

public interface BookService {
	
	/*
	 * 어떤 정보르르 키보드에서 입력받기
	 * 무작정 입력받기하고 
	 * 입력하는 과정에서 문자열을 이력하면
	 * 입력을 중단한다는 신호를 호출한곳으로 리턴
	 * 
	 * 에서 
	 * 모든 항목 입력이 정상적으로 이루어지면 리턴 투루
	 * 만약 중단하디 위해 문자열을 입력하면
	 * 	호출한곳애 펄스 리턴 하여 더이상
	 * 	입력을 하지 않겠다고 신호를 
	 */
	public boolean inputBook();
	public void booklist();

}
