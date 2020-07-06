package com.biz.grade;

import java.util.Random;

public class grade_05 {
	public static void main(String[] args) {

		Random random = new Random();
		int intKor_01 = random.nextInt(50) + 51;
		int intKor_02 = random.nextInt(50) + 51;
		int intKor_03 = random.nextInt(50) + 51;
		int intKor_04 = random.nextInt(50) + 51;
		int intKor_05 = random.nextInt(50) + 51;
		int intKor_06 = random.nextInt(50) + 51;
		int intKor_07 = random.nextInt(50) + 51;
		int intKor_08 = random.nextInt(50) + 51;
		int intKor_09 = random.nextInt(50) + 51;
		int intKor_10 = random.nextInt(50) + 51;

		int intSum = intKor_01;
		intSum += intKor_02;
		intSum += intKor_03;
		intSum += intKor_04;
		intSum += intKor_05;
		intSum += intKor_06;
		intSum += intKor_07;
		intSum += intKor_08;
		intSum += intKor_09;
		intSum += intKor_10;

		int intAvg = intSum / 10;

		System.out.println("국어 점수 학생1" + intKor_01);
		System.out.println("국어 점수 학생2" + intKor_02);
		System.out.println("국어 점수 학생3" + intKor_03);
		System.out.println("국어 점수 학생4" + intKor_04);
		System.out.println("국어 점수 학생5" + intKor_05);
		System.out.println("국어 점수 학생6" + intKor_06);
		System.out.println("국어 점수 학생7" + intKor_07);
		System.out.println("국어 점수 학생8" + intKor_08);
		System.out.println("국어 점수 학생9" + intKor_09);
		System.out.println("국어 점수 학생10" + intKor_10);

		System.out.println("총점 : " + intSum);
		System.out.println("평균 : " + intAvg);

	}

}
