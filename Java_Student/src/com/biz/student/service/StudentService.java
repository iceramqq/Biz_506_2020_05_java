package com.biz.student.service;

/*
 * service
 * Business Login
 * 실제 어떤 일들을 수행하는 주요 메서드를 모아두는
 * 프로젝트에서 주요 연산을 수행하는 코드를 수현할때
 * 클래스에 구현을 한다.
 * 
 * 클래스는 특별한경우가 아니면 먼저 를 만들어서
 */

public interface StudentService {
	
	/*
	 * 학생정보를 키보드로 입력하는 메서드
	 * 1. 학생1명의 정보를 키보드로 입력받고
	 * 2. 학생 리스트에 추가하는 코드가 작성
	 * 3. 학생 점보를 입력받는 과정에서
	 * 		입력을 중단하고 중단되었다는 것을
	 * 
	 */
	public boolean inputStudent();
	public void studentList();
}
