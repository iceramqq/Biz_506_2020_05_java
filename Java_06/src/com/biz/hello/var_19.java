package com.biz.hello;

import java.util.Random;

public class var_19 {
	public static void main(String[] args) {
		float Korscore;
		float Engscore;
		float Mathscore;
		
		Random rnd=new Random();
		int num=rnd.nextInt(500)+501;
		Korscore=(float)num/10;
		
		int num1=rnd.nextInt(500)+501;
		Engscore=(float)num1/10;
		
		int num2=rnd.nextInt(500)+501;
		Mathscore=(float)num2/10;
		
		float sum=Korscore+Mathscore+Korscore;
		float avg=sum/3;
		
		System.out.println("총점"+sum);
		System.out.println("평균"+avg);
		
		
	}

}
