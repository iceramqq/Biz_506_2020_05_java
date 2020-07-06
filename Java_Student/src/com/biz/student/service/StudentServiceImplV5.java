package com.biz.student.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

import com.biz.student.donain.StudentVO;

/*
 * 파일을 읽어서 에 저장하고
 * 파일에 학생명부 출력
 * 
 * 를변경하여 
 * 콤퓨터공학인 학생들만 리스트를 출력하시오
 */
public class StudentServiceImplV5 extends StudentServiceImplV2 {
	
	public StudentServiceImplV5() {
		outPut = System.out;
	}
	
	@Override
	public boolean inputStudent() {
		
		String studentFile = "src/com/biz/student/exec/student.txt";
		
		FileReader fileReader = null;
		
		BufferedReader buffer = null;
		
		try {
			fileReader =new FileReader(studentFile);
			
			buffer = new BufferedReader(fileReader);
			
			String reader = "";
			
			while (true) {
				
				reader = buffer.readLine();
				if(reader == null) {
					break;
				}
				String[] students = reader.split(":");
				StudentVO sVO = new StudentVO();
				sVO.setNum(students[0]);
				sVO.setName(students[1]);
				sVO.setGrade(Integer.valueOf(students[2]));
				sVO.setDept(students[4]);
				if(sVO.getDept().equals("컴퓨터공학")) {
					studentList.add(sVO);					
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return true;
	}

}
