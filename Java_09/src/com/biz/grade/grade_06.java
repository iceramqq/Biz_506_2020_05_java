package com.biz.grade;

import com.biz.score.Student;

public class grade_06 {
	
	public static void main(String[] args) {
	
		String strName="이몽룡";
		strName="이몽룡";
		String strN= strName;
		System.out.println(strN);
		
		int intAge=27;
		String strTel="010-111-1111";
		System.out.println(intAge);
		System.out.println(strTel);
		
		Student st =new Student();
		st.make();
		strN=st.getName();
		System.out.println(strN);
		
		
		
	}

}
