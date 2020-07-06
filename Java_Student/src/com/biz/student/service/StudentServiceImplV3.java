package com.biz.student.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

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
public class StudentServiceImplV3 extends StudentServiceImplV2 {

	@Override
	public boolean inputStudent() {
		
		String studentFile = "src/com/biz/student/exec/student.txt";
		
		// FileReader클래스로 객체 fileReader를 선언하고 clear하기
		// 문자열, 숫다 등이 아닌 정체를 알수 없는 클래스로 객체를 선언항때는
		// 가급적 null로 clear를 시켜주는 것이 좋다.
		FileReader fileReader = null;
		
		// 로컬디스크에 저장된 파일을 읽을때 만으로 읽을 수 있지만
		// 파일을 읽어들이는 성능사의 있점을 주기 위해서 중간 를
		// 연결하여 파일을 읽어 들이는 것이 좋다.
		BufferedReader buffer = null;
		
		try {
			// 읽어들일 파일을 열고, 파일에 광련괸 정보를 객체에 저장
			fileReader =new FileReader(studentFile);
			
			// 객체에 저장된 정보르르 관리자에 ㅓㄴ달하여 파일을 읽도록 지시
			// 관리자는 파일을 몽땅 읽어서
			// 자신이 관리하는 장치에 임시 보관
			buffer = new BufferedReader(fileReader);
			
			// 따라서 문자열 변수는
			// 먼저 선언, clear를 하고 진행하는 것이 좋다.
			String reader = "";
			
			/*
			 * 파일의 라인수가 200개로 정해지고 그 라인수를 알수 있다면
			 * 
			for (int i = 0; i < 200; i++) {
				reader = buffer.readLine();
				System.out.println(reader);
			}
			하지만 파일은 상황애 따라 라인수가 변동될수도 잇고,
			라인수를 예측하지 못하는 상황이
			*/
			while (true) {
				
				// 메서드는 호출될때마다
				// 로 부터 파일을 한줄씩 읽어서 변수에 담는다.
				// 로 부터 파일을 읽어오다가 파일을 모두 읽었는데도 불구하고
				// 또 메서드를 호출하면 null값이 리턴 되고
				
				reader = buffer.readLine();
				if(reader == null) {
					break;
				}
				System.out.println(reader);
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
