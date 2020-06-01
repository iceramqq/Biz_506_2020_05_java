package com.biz.classes.model;

public class Address {
	
	
	//멤버변수가 private이기 때문에
	//인스턴스를 통해서 직접접근이 불가능하다
	private String city;
	private String gu;
	private String dong;
	private String addr;
	
	private int age;
	
	//agr변수
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	
	//인스턴스를 통해서 필드변수에 값을 저장하기 위한
	//setter method()
	//(String city) : 매개변수, 파라메타, argment
	//	인스턴스를 통해서
	//	
	public void setCity(String city) {
		this.city=city;
	}
	
	//인스턴스를 통해서 필드변수에 저장된 값을 
	//읽기위한 getter mathod()
	public String getCity() {
		//return키워드가 있는 method는 
		//return하고자 하는 값의 type을 method 이름 앞에
		return city;
	}

}
