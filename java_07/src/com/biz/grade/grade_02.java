package com.biz.grade;

import java.util.Random;

public class grade_02 {

	public static void main(String[] args) {

		int intKor = 0;// 변수선언과 초기화 코드

		// 클래스 클래스로 만든 변수 초기화생성 코드
		// 모든 변수는 선언을 하고 초기화를 수행해야한다
		Random random = new Random();

		// string도 실제로 클래스 키워드 라고 한다
		String string = "홍길동";

		/*
		 * 따라서 string 혈 변수도 원래는 new String을
		 */
		//String string = new String();

		/*
		 * 0~99까지 임의의 수를 10개 생성하고
		 * intSum변수에 누적하기
		 */

		int intSum = 0;
		for (int i = 0; i < 10; i++) {
			int intNum = random.nextInt(100);
			intSum += intNum;
		}
		
		System.out.println(intSum);
		
		
	}

}
