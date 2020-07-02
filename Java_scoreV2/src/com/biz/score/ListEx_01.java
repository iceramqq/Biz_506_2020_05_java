package com.biz.score;

import java.util.ArrayList;
import java.util.List;

public class ListEx_01 {
	
	public static void main(String[] args) {
		
		// 객체들의 묶음 객체
		// 리스트에 포함된 객체가 무엇인가를 명시
		List<String> strList; // 객체이 요소로 포함된 리스트다
		strList = new ArrayList<String>();
		
		strList.add("korea");
		strList.add("대한민국");
		strList.add("우리나라 만세");
		
		int size = strList.size();
		for (int i = 0; i < size; i++) {
			String str = strList.get(i);
			System.out.println(str);
		}
		
		strList.add("이몽룡");
		strList.add("성춘향");
		strList.add("장보고");
		
		size = strList.size();
		for (int i = 0; i < size; i++) {
			System.out.println( strList.get(i));
		}
		
		// 문이 개수만큼 반복 수행되는 동안
		// 계속해서 를 호출하여 연산을 수행하도록 한다
		// 개수가 반복문 내에서 젼경되지 않는 경우
		// 
		for (int i = 0; i < strList.size(); i++) {
			System.out.println( strList.get(i));
		}
		
		// 개수를 1번만 조회하고 반복문 수행하기
		// 
		// 반복문 연산 수행에 문제가 될수 있다
		size = strList.size();
		for (int i = 0; i < size; i++) {
			System.out.println( strList.get(i));
		}
		
		//전채에 대해서 반복문을 수행할 경우 사용할 수 있는 항상된 , 라고 한다
		//1. 개수만큼 알아서 가 반목된다
		//2. 가 밤복되면서 를 변수에 활당
		//3. 반복문 내에서 변수 값을  읽어서 사용할 수 있다.
		for (String str : strList) {
			System.out.println(str);
		}
		
		//배열도 향상된 를 사용하여 반복문 수행할 수 있다.
		int[] intArray = new int[100];
		for (int i : intArray) {
			System.out.println(i);
		}
		
		
		
	}
}
