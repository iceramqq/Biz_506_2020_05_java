package com.biz.hello;

import java.util.Random;

public class var_13 {
	public static void main(String[] args) {
		Random rnd=new Random();
		int sum=0;
		for(int i=0;i<100;i++) {
			int num=rnd.nextInt(100)+1;
			sum+=num;
		}
		/*
		 * num변수는 (){}
		 * 
		 * sum변수의 값은 그대로 유지된다
		 */
		System.out.println("100개의 임의수 합계 : "+sum);
	}
}
