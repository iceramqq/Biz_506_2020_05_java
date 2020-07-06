package com.biz.hello;

import java.util.Random;

public class var_17 {

	public static void main(String[] args) {
		
		/*
		 * 변수 이름 짓기
		 * 변수 이름 첫글자 영문 소문자
		 * 변수 이름은 이름만으로 하는일을 유추할수 있게 짓는 것이좋다
		 *  
		 */
		int intKor;
		int intEng;
		int intMath;
		
		Random rnd=new Random();
		
		intKor=rnd.nextInt(50)+51;
		intEng=rnd.nextInt(50)+51;
		intMath=rnd.nextInt(50)+51;
		
		int intSum;
		int intAvg;
		
		intSum=intKor;
		intSum+=intEng;
		intSum+=intMath;
		
		intAvg=intSum/3;
		
		System.out.println("총점"+intSum);
		System.out.println("평균"+intAvg);
	}

}
