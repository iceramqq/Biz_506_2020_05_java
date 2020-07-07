package com.biz.word.domain;

/*
 * static 클래스는 초기화 과정이 수행 할 필요 없이 사용할수 있다.
 * 
 * 클래스는  프로젝트가 시작되는 순간
 * 자동으로 객체를 1번 생성하여 메서드 기억영역에 보관해 둔다
 * 1번만 생성되기 때문에 메모리 공간을 1번만 차지하는 효과를 내고
 * 
 */
public class SplitPosition {
	
	//으로 선언된 변수는
	//누구나 어디에서든지 접근하여 읽기, 쓰기 가능하다
	//
	//변수를 진짜 사용해야할 곳에서 문제가 바생할수 있다.
	//
	//final 키워드가 부착된 변수는 다른곳에서 
	//절대 값을 변경할수 없게 된다.
	public static final int WORD_ENG = 0;
	public static final int WORD_KOR = 1;
	
	public static void out(String str) {
		System.out.println(str);
	}

}
