package com.biz.test;

public class WrapperEx {

	public static void main(String[] args) {
		
		/*
		 * Primitive
		 * java언어에 공식적으로 내장된 변수선언문
		 * 어떤 값을 메모리에 저장하는 용도로 변수를 선언하는 명령문
		 * 특별한 기능을 
		 */
		int n1;
		float f1;
		double d1;
		boolean b1;
		char c1;
		long l1;
		
		/*
		 * wrapper 클래스
		 * primitive 변수처럼 사용할수 있는 특별한 클래스
		 */
		
		Integer num1 = new Integer(10);
		
		/*
		 * int 형의 값 20일 Integer형 num2 객체에 할당(저장)
		 * 일반적인 클래스는 이러한 문법을 절대 사용할 수 없다.
		 * wrapper 클래스는 primitive 데이터와 서로 주고받는 관계가 성립도니다.
		 * int 형 값 20을 Integer 형 num2 객체에 할당을 하면
		 * 내부적으로 자동으로 int형을 Integer형으로 boxing한다.
		 */
		Integer num2 = 20;
		/*
		 * num2 객체를 num3인 primitive 변수에 저장(활당)
		 * 일반적인 클래스에서는 불가능하지만
		 * wrapper ㅋ르래스에서는 가능하며
		 * 클해스를 값을로 볏겨내어 일반 변후에 저장
		 * 가능
		 */
		int num3 = num2;
		
		Integer sum = num1 + num2;
		System.out.println(sum);
	}
}
