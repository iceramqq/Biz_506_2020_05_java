package com.biz.hello;

import java.util.Random;

public class var_16 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int intKor = rnd.nextInt(50) + 51;
		int intEng = rnd.nextInt(50) + 51;
		int intMath = rnd.nextInt(50) + 51;

		int sum = intMath + intEng + intKor;
		int avg = sum / 3;

		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);

	}

}
