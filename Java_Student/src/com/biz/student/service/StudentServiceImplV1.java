package com.biz.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.student.donain.StudentVO;

public class StudentServiceImplV1 implements StudentService {
	
	// 필드변수
	// class Scope의 변수를 선언하기
	// 여기(필드변수 영역)에 선언된 변수는
	// 현재 클래스의 보든 메서드들이 곤뉴하고, 참조(쓰고, 읽기)기 가능하다.
	
	// 변수의 scope
	// 
	
	//필드변수를 선언하때 접근제한자를 중에 한가지로 설정항 수 있다.
	
	//필드변수를 으로 선언하는 것은 객체의 정모은닉, 캡슈화 패턴에 적합한 방식이다
	//외부에서 접근하지 못하도록 차당하고 현재 클래스에 선언된 메서드에서만
	
	//필드변수를 로 선언하기
	// 는 접근제한다와 거의 유사란 형태이다.
	// 만약 현재 클래스를 다른 클래스를 만들때 상속하여 사용하려고 할때
	// 상속받은 클래스에서 현재 클래스의 필드변수를 같이 상속받아서 사용하고자 할때는
	// 변수를 로 선언한다.
	
	// 만약 으로 선언을 하게 되면 상속받은 클래스에서 이 변수들을
	// 다시 선언해 주어야 한다.
	protected List<StudentVO> studentList;
	
	// 클래스 생성자
	//클래스를 객체러 만들때 호출되는 메서드
	//클래스를 객체로 생성할때 1번 호출되는 메서드로 반드시 생성가 필요한 필드변수들을 여기에 생성하는 코드를 작성한다
	public StudentServiceImplV1() {
		studentList = new ArrayList<StudentVO>();	
	}

	@Override
	public boolean inputStudent() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		StudentVO studentVO = new StudentVO();
		
		System.out.print("학번(종료:END) >>");
		String strNum = scan.nextLine();
		if(strNum.equals("END")) {
			return false;
		}
		studentVO.setNum(strNum);
		
		System.out.print("이름 >>");
		String strName = scan.nextLine();
		studentVO.setName(strName);
		
		System.out.print("학년 >>");
		String strGrade = scan.nextLine();
		int intGrade = 0;
		//유효성 검다
		//유효성검사는 개발자 입장에서는 매우 귀찮은 단순노동일 경우가 많지만
		//사용자입장에서는 유효성검사가 많으면 그만큼 잘못된 데이터를 입력하는 경우를 방지 할수 있다.
		try {
			intGrade = Integer.valueOf(strGrade);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("학년은 숫자만 입력 가능!!");
			System.out.println(studentVO.getName() + "학생정보를 다시 입력해 주세요");
			return true;
		}
		
		if(intGrade <1 || intGrade >4) {
			System.out.println("학년은 1~4까지만 가능");
			System.out.println(studentVO.getName() + "학생정보를 다시 입력해 주세요");
			return true;
		}
		studentVO.setGrade(intGrade);
		
		System.out.print("전공 >>");
		String strDept = scan.nextLine();
		studentVO.setDept(strDept);
		
		//모든 입력이 정상처리되었으면 리스트에 추가한다.
		studentList.add(studentVO);
		
		// 제일 끝의 리턴문은 한 학생의 정보가 모두 정상 입력이 되면 true를 return하여 다음 학생 정보를 입력하도록
		// 호출한 곳에 통보해야 하는데 이때 true를 return하도록 해야한다.
		return true;
	}

	@Override
	public void studentList() {
		// TODO Auto-generated method stub
		
		System.out.println("=======================================");
		System.out.println("학생일람표");
		System.out.println("=======================================");
		System.out.println("학번\t이름\t학년\t전공");
		System.out.println("---------------------------------------");
		int size = studentList.size();
		for (int i = 0; i < size; i++) {
			StudentVO sVO = studentList.get(i);
			System.out.print(sVO.getNum()+"\t");
			System.out.print(sVO.getName()+"\t");
			System.out.print(sVO.getGrade()+"\t");
			System.out.print(sVO.getDept()+"\n");
			if(i == (size-1)) {
				continue;
			}
			if((i+1) % 2 == 0) {
				System.out.println("---------------------------------------");
			}
		} 
		System.out.println("=======================================");
	}

}
