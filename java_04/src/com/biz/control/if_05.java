package com.biz.control;

import java.util.Random;

public class if_05 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int num1 = rnd.nextInt(100) + 1;
		/*
		 * if(조건1) {
		 * 
		 * } else if(조건2) {
		 * 
		 * } else {
		 * 
		 * }
		 * 
		 * 여러가지 조건중에 1가지 조건을 찾고자 할때 사용하는 명령구조
		 * 만약 조건1이 true 경우 나머지 코드를 없는 코드 취급한다.
		 * 
		 */
		if (num1 % 5 == 0) {
			System.out.printf("%d 는 5의 배수\n", num1);
		} else if (num1 % 4 == 0) {
			System.out.printf("%d 는 4의 배수\n", num1);
		} else if (num1 % 3 == 0) {
			System.out.printf("%d 는 3의 배수\n", num1);
		} else if (num1 % 2 == 0) {
			System.out.printf("%d 는 2의 배수\n", num1);
		} else {
			System.out.printf("%d 는 5, 4, 3, 2 의 배수가 아니다.\n", num1);
		}
		
		
		
	}

}
