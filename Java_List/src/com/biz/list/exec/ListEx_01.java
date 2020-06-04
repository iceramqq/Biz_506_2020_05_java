package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * com.biz.list : 3단계 패키지, 
 * 
 */
public class ListEx_01 {

	public static void main(String[] args) {
		
		//Random클래스를 사용해서 뭔가를 수행을 하기 위한 준비
		//클래스
		// Random클래스의 인스턴스, 객체
		//	rnd 인스턴스를 사용가능하도록 초기화
		//	new : rnd 인스턴스를 초기화 하겠다
		//		라는 키워드
		//		생성자 메서드
		Random rnd = new Random();
		// Random클래스를 사용해서 rnd인스턴스를 선언하고
		// Random() 생성자를 호출하여
		// rnd 인스턴스를 초기화하라
		
		
		/*
		 * 다른 클래스와 색다르게
		 * 선언하는 클래스와 초시화하는 생성자의 이름이
		 * 다른 형태를 갖는다
		 * 클래스에 <Generic> 키워드를 포함하여 사용을 한다
		 * Integer형 데이터를 포함할 intList를 선언하고
		 * 초기화 하는 코드
		 * Integer형 리스트 라고 부른다
		 * 	
		 */
		List<Integer> intList = new ArrayList<Integer>();
		//리스트를 처음 만들면 사이크 값이 0인 데이터가
		//아무것도 없는 리스트가 만들어진다
		intList.add(90);
		intList.add(100);
		

	}

}
