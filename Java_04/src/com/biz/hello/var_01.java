package com.biz.hello;

public class var_01 {

	public static void main(String[] args) {

		int num1 = 30;
		int num2 = 40;

		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		
		/*
		 * println(0 메서드는 괄호안의 내용을 콘솔에 표시하는 기능 수행
		 * 
		 * 숫자+문자열 형태는 모두 문자열로 변환후 표시
		 * 간단하 ㄴ표시형식은 쉽게 작성하여 표시가능
		 * 조금 복잡한 모양은 오류가 발생하기 쉬움
		 * 
		 * 이러한 문제를 해소하기 위해
		 * printf() 메소드를 준비함
		 * printf() 괄호안에 첫번째에 형식 문자열을 만들고
		 * 이어서 컴마로 연결하여 쉽게 만들어 콘솔에 출력
		 */
		System.out.printf("%d + %d = %d", num1, num2, (num1 + num2));

	}

}
