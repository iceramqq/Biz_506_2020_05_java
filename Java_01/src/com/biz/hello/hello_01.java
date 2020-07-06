package com.biz.hello;

public class hello_01 {

	
	/*
	 * 컴퓨터에서 숫자의 취급
	 * 숫자는 컴퓨터 메모리에 임시로 저장이 되고
	 * 연산처리가 되는데
	 * 메모리 저장공간의 구조에 따라
	 * 저장할수있는 숫자의 크기가 정해진다
	 * 정주는 32비트 공간에  
	 * 
	 * 
	 * 
	 * 실수는 소수점이하 16자리까지 최대 저장
	 * 17자리
	 */
	public static void main(String[] args) {
		
		System.out.println("대한민국만세");
		System.out.println( 30 + 40 );
		System.out.println( 30.0 + 40.0 );
		
		System.out.println( 40 / 30 );
		System.out.println( 40.0 / 30.0 );
		System.out.println(1000_000_000_0000L);

		
		
		
	}
}
