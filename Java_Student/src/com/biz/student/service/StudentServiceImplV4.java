package com.biz.student.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

import com.biz.student.donain.StudentVO;

/*
 * v2는 v1을 상속받아소 를 재정의 해 놓은 상태이다
 * 에서는 를 상속받아서 에 구현된 는 그댜로 사요요하고
 * 에 있는 만 재정의 하여 를 만등겠다 라는 의미 
 * 
 * 에서는 파일을 읽어서 
 * 학생정보를 갖오고 사용하여 출력해보기
 * 
 * 
 */
public class StudentServiceImplV4 extends StudentServiceImplV2 {
	
	public StudentServiceImplV4() {
		outPut = System.out;
	}

	@Override
	public boolean inputStudent() {
		
		String studentFile = "src/com/biz/student/exec/student.txt";
		
		FileReader fileReader = null;
		
		BufferedReader buffer = null;
		
		try {
			// 읽어들일 파일을 열고, 파일에 광련괸 정보를 객체에 저장
			fileReader =new FileReader(studentFile);
			
			buffer = new BufferedReader(fileReader);
			
			String reader = "";
			
			while (true) {
				
				reader = buffer.readLine();
				if(reader == null) {
					break;
				}
				//System.out.println(reader);
				
				// 읽어들인 라인을 분해하여 학생정보로 변환
				String[] students = reader.split(":");
				
				StudentVO sVO = new StudentVO();
				sVO.setNum(students[0]);
				sVO.setName(students[1]);
				sVO.setGrade(Integer.valueOf(students[2]));
				sVO.setDept(students[4]);
				studentList.add(sVO);
				
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
