package com.biz.grade;

import java.util.Random;

import com.biz.score.Student;

public class grade_05 {
	
	public static void main(String[] args) {
		
		int sum=0;
		for(int i=0;i<100000000;i++) {
			sum=100;
		}
		//sum은 얼마??
		//100입니다
		//for문이 0~9999999 반복 될 동안 sum변수에 계속해서 100의 값을 할당하라는 명령문으로
		//sum=100 할당연산자(=)는 전에 어떠한 값이 있더라도 무시하고 마지막 값만을 할당하기에
		//sum 변수 값을 출력하면 마지막으로 할당된 100 값이 출력된다
		
		for (int i=0; i < 10; i++) {
			System.out.println(sum);
		}
		
		
		Student student=new Student();
		
		//student클래스에 선언된 메서드 make() 메서드를 호출하기
		student.make();
		String strN=student.getName();
		/*
		 * public class Student {
     	 *   String strName="홍길동";
	     *  	public void make() {
		 *	        strName="이몽룡";		
         *   	}
         *      ??strName=>이몽룡
         *   
         *   	public String getName() {
         *          return strName;
         *      }
         * } 
         * ?? strName =?
         *  	
         */
		
		System.out.println(strN);
		
		
		Random rnd=new Random();
		rnd.nextInt();
		
		
		
		
		
	}

}
