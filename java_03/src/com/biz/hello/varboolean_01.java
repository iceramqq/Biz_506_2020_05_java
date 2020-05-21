package com.biz.hello;

public class varboolean_01 {
	/*
	 * 코드 작성시 들여쓰기하라
	 */
	public static void main(String[] args) {
		int num1;
		num1=5;
		
		boolean bvar1=true;
		bvar1=(num1%2)==0;
		
	    if(bvar1) {
	    	System.out.println(num1+"는 짝수 입니다");
	    }
	    
	    if(!bvar1) {
	    	System.out.println(num1+"는 짝수가 아닙니다");
	    }
			
	    int num2=30;
	    boolean bVar=(num2%2)==0;
	    if(bVar) {}
	}

}
