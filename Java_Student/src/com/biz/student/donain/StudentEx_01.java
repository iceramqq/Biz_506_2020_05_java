package com.biz.student.donain;

import com.biz.student.service.StudentServiceImplV1;

public class StudentEx_01 {
	
	public static void main(String[] args) {
		
		StudentServiceImplV1 studentaService = new StudentServiceImplV1();
		while (true) {
			if(!studentaService.inputStudent()) {
				break;
			}
		}
		System.out.println("업무종료");
		studentaService.studentList();
		
	}

}
