package com.biz.grade;

import java.util.Random;

public class array_06 {

	public static void main(String[] args) {

		int[] intNum = new int[100];
		
		
		//random 클래스의 생성자
		Random rnd = new Random();

		
		//rnd 인스턴스(instance), 객체(object) : random 클래스로 만든 변수 rnd 변수
		//.nextInt(100) : random클래스 메소드 라고 부른다.
		//rnd 객체의 nextInt() 메서드를 실행하라 라고 한다
		//rnd 객체의 nextInt() 메서드를 호출하라 라고도 한다
		rnd.nextInt(100);
		
		String sreN="홍길동";//문자열 변수 strN
		String sreM=new String();//	
		
		for (int i = 0; i < 100; i++) {
			
			//rnd 객체의 nextInt() 메서드를 실행하여
			//결과 값을 배열 intNum의 i번째 위치에 저장
			intNum[i] = rnd.nextInt(100) + 1;
		}
		
		//배열에 저장된 요소들 중 5개씩 덧셈을 수행할 변수를 선언
		int intSum = 0;
		for (int i = 0; i < 100; i++) {
			System.out.printf("%d\t", intNum[i]);
			intSum += intNum[i];
			if ((i + 1) % 5 == 0) {
				System.out.println(intSum);
				intSum = 0;
			}
		}

	}

}
