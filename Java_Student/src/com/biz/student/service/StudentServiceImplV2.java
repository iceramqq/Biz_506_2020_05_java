package com.biz.student.service;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import com.biz.student.donain.StudentVO;

//에 정의된 필드변수, 메서드를 상속받아서 작성하는 클ㄹ래스
// 필드변수와 메서드를 로 되어있는 거ㅕㅇ우만 상속된다.
public class StudentServiceImplV2 extends StudentServiceImplV1 {

	//에 선언된 응 로 되어잇기 때문에 그대로 접근이 가능하고 의 생성자에서 생성가 되어 잇기 때문에
	//접근하여 

	//v1에서 구현된 studentList() 메서드를 다시 새롭게 구현하겠다
	//리스트를 콘솔에 보여주는 방식이었는데
	//결과를 파일에 저장하여 프로젝트가 종료되어도 언제든지 결과를 확인할 수 있도록 구현해보자
	//데이터, 결과를 파일로 저장하는 것은 결과를 영구 보관하는 목적이 있다.
	//이러한 것을 프로젝트에서 persistance라고 한다.
	
	protected PrintStream outPut;
	
	public StudentServiceImplV2() {
		String studentFile = "src/com/biz/student/exec/Student_List.txt";
		outPut = System.out;
		System.out.println("콘솔에 데이터 출력하기");
		// 파일을 작성하는 과정에서
		// 아무리 코드를 잘 작성해도 운영체제 차원에서 발생하는 은
		//코드에서 처리가 어렵다는 것을 컴파일러가 알고 잇기 때문에
		//개발자에게 의무적으로 처리를 하도록 규정하고 있다
		try {
			outPut = new PrintStream(studentFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(studentFile + " 파일을 만들수 없음!!");
			return;
		}
	}
	
	@Override
	public void studentList() {
		
		outPut.println("==========================================");
		outPut.println("학생일람표");
		outPut.println("==========================================");
		outPut.println("학번\t이름\t학년\t학과");
		outPut.println("==========================================");
		for (StudentVO sVO : studentList) {
			outPut.print(sVO.getNum()+"\t");
			outPut.print(sVO.getName()+"\t");
			outPut.print(sVO.getGrade()+"\t");
			outPut.print(sVO.getDept()+"\n");
		}
		outPut.println("==========================================");
		outPut.close();
	}
	
	
}