package com.biz.hello;

public class varString_05 {
	public static void main(String[] args) {
		
		int num1=0;
		float num2=0;
		
		num1= (int)num2;//강제적 형변환
		num2=num1;//묵시적 형변환
		
		//문자열형을 정수형변수에 저장하는 것은 특별한 경우를 제외하고 불가능 하다
		//num1="대한민국";
		
		
		
		/*
		 * 문자를 정수형변수에 담기
		 * 문자는 it기기에서 정보를 주고 받는데 필요한
		 * 코드값을 취급하는 파입이다
		 * '문자'를 정수형변수에 담으면 '문자' 고유의 코드값이 10진수로 변환되어 정수형변수에 저장
		 */
		num1='A';
		System.out.println(num1);
		
		num1='B';
		System.out.println(num1);
		
		
		
		num1='a';
		System.out.println(num1);
		
		num1='b';
		System.out.println(num1);
		
		//문자'A'를 문자열로 변환하고
		//문자열"A"와 연결하여 sre1에 저장하라
		//문자'A'를 바로 저장하지 못하는 것은
		//character특성상 내부적을로 10진수형식으로 저장되기 때문
		String str1='A'+"A";
		System.out.println(str1);
		
		str1=('A'+0)+"A";
		System.out.println(str1);
				
		
	}

}
