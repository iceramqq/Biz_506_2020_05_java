package com.biz.control;

import java.util.Random;
import java.util.concurrent.RecursiveAction;

public class if_04 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int num1 = rnd.nextInt(100) + 1;
		/*
		 * if(조건1){
		 * }
		 * if(조건2){
		 * }
		 * if(조건1 != && 조건2!= true){
		 * }
		 * 
		 * 여러조건문 중에서 true인 것을 모든 경우를 검사하기 위한 조건
		 * 단 1가지 조건만 true인 경우에도 모두 검사해야한다.
		 * 필요한 경우 사용하기도 하며, 여러조건중 1가지만을 검사하고자 한다면
		 * 비효율적인 코드가 될수있다.
		 * 
		 * 
		 */
		if (num1 % 5 == 0) {
			System.out.printf("%d 은 5의 배수\n", num1);
		}
		if (num1 % 4 == 0) {
			System.out.printf("%d 은 4의 배수\n", num1);
		}
		if (num1 % 3 == 0) {
			System.out.printf("%d 은 3의 배수\n", num1);
		}
		if (num1 % 2 == 0) {
			System.out.printf("%d 은 2의 배수\n", num1);
		}
		if (num1 % 5 != 0 && num1 % 4 != 0 && num1 % 3 != 0 && num1 % 2 != 0) {
			System.out.printf("%d 은 5,4,3,2의 배수가ㅏ 아니다\n", num1);
		}
	}

}
