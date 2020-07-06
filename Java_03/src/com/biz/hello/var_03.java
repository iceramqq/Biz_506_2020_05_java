package com.biz.hello;

import java.util.Random;

public class var_03 {
	public static void main(String[] args) {

		Random rnd = new Random();
		int num1 = rnd.nextInt(100) + 1;
		int num2 = rnd.nextInt(100) + 1;

		if ((num1 + num2) % 2 == 0) {
			System.out.println("덧셈은 짝수");
		}
		if ((num1 - num2) % 2 == 0) {
			System.out.println("뺄셈은 짝수");
		}
		if ((num1 * num2) % 2 == 0) {
			System.out.println("곱셈은 짝수");
		}
		if ((num1 / num2) % 2 == 0) {
			System.out.println("나눗셈은 짝수");
		}

	}

}
