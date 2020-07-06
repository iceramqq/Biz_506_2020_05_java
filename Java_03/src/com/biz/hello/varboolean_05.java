package com.biz.hello;

import java.util.Random;

public class varboolean_05 {
	public static void main(String[] args) {
		Random rnd=new Random();
		int num1= rnd.nextInt(100);
		boolean bvar= (num1%2)==0;
		
		if(bvar) {
			System.out.println(num1+"은 짝수");
		}

		if(!bvar) {
			System.out.println(num1+"은 짝수가 아님");
		}
   	}

}
