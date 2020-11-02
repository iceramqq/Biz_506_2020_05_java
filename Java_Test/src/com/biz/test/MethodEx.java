package com.biz.test;

public class MethodEx {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		Call call = new Call();
		
		/*
		 * add() method는 정수형 매개변수를 2ㄱ4ㅐ를 받아소
		 * 연산처리를 하도록 만들어져야한다.
		 * 반드시 return type이 패
		 */
		int sum = call.add(num1,num2);
		System.out.println(sum);
		
		/*
		 * sum() method는 매개변수가 없고
		 * 리턴타입은 
		 */
		call.sum();
	}
}
