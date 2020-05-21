package com.biz.hello;

public class varboolean_04 {
	
	public static void main(String[] args) {
		/*
		 *불린형 변수는 오로지 트루, 폴스 중 1가지 값만을
		 *가지는 특별한 변수
		 *
		 * 불린형 변수는 혼자서 어떤 연산을 수행하기 보다는
		 * 다른 키워드와 조합히여 연산 수행
		 */
		boolean bvar1=false;
		boolean bvar2=false;
		
		int num1=33;
		bvar1=(num1%2)==0;//num1가 even or odd ?
		
		System.out.println(++num1+"는 짝수 ? "+((num1%2)==0));
		System.out.println(++num1+"는 짝수 ? "+((num1%2)==0));
		System.out.println(++num1+"는 짝수 ? "+((num1%2)==0));
		System.out.println(++num1+"는 짝수 ? "+((num1%2)==0));
		System.out.println(++num1+"는 짝수 ? "+((num1%2)==0));
		System.out.println(++num1+"는 짝수 ? "+((num1%2)==0));
		
		
		
	}

}
