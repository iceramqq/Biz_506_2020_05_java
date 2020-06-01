package com.biz.classes.service;

/*
 * 클래스에 메서드를 선언헤 두고
 * 클래스를 인스턴스로 생성하여 메서드를 호출하면
 * 
 */
public class LineService {
	
	public String single(int num) {
		
		String Line="";
		for(int i=0;i<num;i++) {
			Line+="-";
		}
		return Line;
	}
public String do_Line(int num) {
		
		String Line="";
		for(int i=0;i<num;i++) {
			Line+="=";
		}
		return Line;
	}

}
