package com.biz.hello;

public class varboolean_05 {
	
	public static void main(String[] args) {
		
		int num1=34;
		boolean bvar1=(num1%2)==0;
		
		
		if(bvar1 == true) {
			System.out.println(num1+"는 짝수입니다");
		}
	

		if(bvar1 == false) {
			System.out.println(num1+"는 짝수가 아닙니다");
		}
	
		
		if(bvar1) {
			System.out.println("bvar1은 true입니다");
		}
		
		if(!bvar1) {
			System.out.println("bvar1은 true가 아닙니다");
		}
		
		if(num1%2==0) {
			System.out.println(num1+"는 짝수");
		}
		
		if(num1%2!=0) {
			System.out.println(num1+"는 짝수가 아님");
		}
		
		if(num1%3==0) {
			System.out.println(num1+"는 3의 배수");
		}
		
		if(num1%3!=0) {
			System.out.println(num1+"는 3의 배수가 아님");
		}
		
		
	}

}
