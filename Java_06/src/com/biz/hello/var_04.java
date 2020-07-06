package com.biz.hello;

import java.util.Random;

public class var_04 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int num = rnd.nextInt(100) + 1;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.printf("%d 로 나눈 나머지가 0 이므로 %d 는 소수가 아님\n", i, num);
			
				/*
				 * 2~num-1까지 범위의 값으로
				 * num를 나누어 한번이라도 나머지가 0이 아닌 경우가
				 */
				break;
			}

		}

	}

}
