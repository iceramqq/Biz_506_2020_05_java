package com.biz.control;

import java.util.Random;

public class if_07 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int intkor = rnd.nextInt(51) + 50;
		int inteng = rnd.nextInt(51) + 50;
		int intmath = rnd.nextInt(51) + 50;

		int sum = intkor + inteng + intmath;
		int avg = sum / 3;

		System.out.println("총점 :" + sum);
		System.out.println("평균 :" + avg);

		if (avg >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

	}

}
