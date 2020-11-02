package com.biz.test;

public class SumEx {
	
	public static void main(String[] args) {
		
		int intSum=0;
		/*
		 * i값이 0~99까지 변동되며 반복문이 실행된다.
		 */
		for (int i = 0; i < 100; i++) {
			
			/*
			 * i값에 1을 더하면 결과는 1~100까지 변동되며 반복문이 실행될 것이고
			 * 그 결과를 intSum변수에 누적연산을 수행하여 1~100 
			 */
			intSum+=(i+1);
		}
	}
}
