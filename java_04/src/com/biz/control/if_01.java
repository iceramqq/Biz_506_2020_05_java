package com.biz.control;

public class if_01 {
	
	
	public static void main(String[] args) {
		boolean bvar =true;
		if(bvar) {
			System.out.println("bvar는 true");
		}
		
		bvar=(32%2)==0;
		if(bvar) {
			System.out.println("32는 짝수");
		}
		
		/*
		 * if 명령문을 사용할 때
		 * boolean형 변수를 만들어서
		 * 연산결과를 변수에 담고 처리 하는 경우 보다
		 * 직접 if
		 * 
		 */
		if((32%2)==0) {
			System.out.println("32는 짝수");
		}
	
	}

}
