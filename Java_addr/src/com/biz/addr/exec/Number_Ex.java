package com.biz.addr.exec;

public class Number_Ex {
	public static void main(String[] args) {
		
		/*
		 * 숫자형 의 를 사용하면
		 * 숫자향 문자들을 숫자형 데이터를 변환 시킬수 있다
		 * 
		 * 오래된 java 버전에서는 의 성능차이가 있었으나
		 * 이상에서는 내부 메커니즘이 같아져 성은 차이가 없다.
		 */
		
		// Integer.valueOf() : 숫자형 문자열을 정수로 변환시키는 메서드
		Integer.valueOf("34");
		
		Float.valueOf("34.3");
		Double.valueOf("34.3");
		Long.valueOf("333333");
		
		Integer.parseInt("34");
		Float.parseFloat("34.3");
		Double.parseDouble("34.3");
		Long.parseLong("333333");
		
		// 아래와 같은 경우가
		Integer.valueOf("");
		
		Integer.valueOf("34 "); // 슷자 앞, 뒤에 문제
		Integer.valueOf("A34"); // 슷자 앞, 뒤에 숫자형 이외의 문자열이 있는 경우
		Integer.valueOf("3 4"); // 슷자 중간에 숫자형 이외의 문자열이 있는 경우
		Integer.valueOf("3+4"); // 하나의 문자열이 연산식 처럼 보일때
		
	}
}
