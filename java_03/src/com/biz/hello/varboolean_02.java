package com.biz.hello;

public class varboolean_02 {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 1;
		boolean bvar1 = true;
		bvar1 = ((num1 + num2) % 2) == 0;
		if (bvar1) {
			System.out.println(num1 + "+" + num2 + "는 짝수 입니다");
		}
		if (!bvar1) {
			System.out.println(num1 + "+" + num2 + "는 짝수가 아닙니다");
		}

		bvar1 = ((num1 - num2) % 2) == 0;

		if (bvar1) {
			System.out.println(num1 + "-" + num2 + "는 짝수 입니다");
		}

		if (!bvar1) {
			System.out.println(num1 + "-" + num2 + "는 짝수가 아닙니다");
		}
		bvar1 = ((num1 * num2) % 2) == 0;

		if (bvar1) {
			System.out.println(num1 + "x" + num2 + "는 짝수 입니다");
		}

		if (!bvar1) {
			System.out.println(num1 + "x" + num2 + "는 짝수가 아닙니다");
		}
		bvar1 = ((num1 / num2) % 2) == 0;

		if (bvar1) {
			System.out.println(num1 + "/" + num2 + "는 짝수 입니다");
		}

		if (!bvar1) {
			System.out.println(num1 + "/" + num2 + "는 짝수가 아닙니다");
		}
		
		
		int nump=num1+num2;
		int numm=num1-num2;
		int numt=num1*num2;
		int numd=num1/num2;
		
		boolean bvarp = (nump%2)==0;
		boolean bvarm = (numm%2)==0;
		boolean bvart = (numt%2)==0;
		boolean bvard = (numd%2)==0;
		
		System.out.println(bvarp);//true
		System.out.println(bvarm);//true
		System.out.println(bvart);//false
		System.out.println(bvard);//false
		
		if(bvarp) {
			System.out.println("덧셈 결과는 짝수");
		}

		if(bvarm) {
			System.out.println("뺄셈 결과는 짝수");
		}
		if(bvart) {
			System.out.println("곱셈 결과는 짝수");
		}
		if(bvard) {
			System.out.println("나눗셈 결과는 짝수");
		}
	}

}
