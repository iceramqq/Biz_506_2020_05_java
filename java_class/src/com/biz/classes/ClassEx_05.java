package com.biz.classes;

import com.biz.classes.model.Address;

public class ClassEx_05 {
	
	public static void main(String[] args) {
		
		//Address클래스를 addr인스턴슬 생성
		Address addr= new Address();
		
		//addr인스턴스
		int age = addr.getAge();//age 값을 setring 하기전에 읽음, 값은 이 나온다
		addr.setAge(22);
		System.out.println(age);
		//클래스에 선어노딘 메서드들은 클래스에 선언된 순서는 아무런 영향이 없다
		//인스턴스를 만들고 인스턴스를 통해서 호출되는 순서대로
		//
		
	}

}
