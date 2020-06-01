package com.biz.classes;

/*
 *클래스
 *java 언어를 사용하여 코딩을 할때 가장 기본적인 파일의 단위
 *
 * 클래스의 이름 짓기
 * 첫글자는 반드시 영문 대문자,
 * 두번째 영문대소문자, 숫자 _ 를 사용할수 있다.
 * 한글로 
 * 
 * 
 * 
 * 클래스 중에서 main() method가 있는 클래스는 런을 했을때
 * 제일먼저 코드가 실행되는 곳
 * 를 진입점, 시작점 이라고 한다
 * 
 * main() method 가 없는 클래스 혼자서는 코드작동이 되지 않는다 
 */

public class classEx_01 {
	
	public static void main(String[] args) {
		
		//코드가 실행된다
		//=코드가 컴파일되어 내부적으로 연산이 이루어진다
		int num1=10;
		int num2=20;
		System.out.println(num1+num2);
		
	}

}
