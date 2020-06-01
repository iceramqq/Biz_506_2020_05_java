package com.biz.classes;

import com.biz.classes.model.Student;

public class ClassEx_02 {
	
	public static void main(String[] args) {
		
		//
		//
		//
		//
		//인스턴스 변수와 유사하지만 사용법이 다소 다르다
		//변수는 값을 저장하는 공간을 제공하는 역할을 수행하지만
		//인스턴스는 값을 저장하는 공간과
		//값을 연산하는 기능을 같이 가지고 있다
		Student student=new Student();
		
		//클래스에 선언된 method를 호출하여
		//연산을 수행하는 방법
		student.setName();
		
		//클래스에 선언된
		//
		student.name="홍길동";
		
		//
		//
		System.out.println(student.name);
		
		//멤버ㅕㄴ수에 public ㅋ;워드가 있으면
		//인스턴스를 통해서 변수에 값을 저장하거나
		//값을 읽을
		
		//멤버변수에 접근제한자를 붙이지 않으면
		//클래스가 저장된 패키지에 따라서
		//public으로 인식되기도 하고, private인식디기도 한다
		//
		//student.rem="접근제한자 없음";
		
		
		
	}

}
