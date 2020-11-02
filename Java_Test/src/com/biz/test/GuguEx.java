package com.biz.test;

import java.util.Random;

public class GuguEx {

	public static void main(String[] args) {
		/*
		int num = 7;
		System.out.println("=====================");
		System.out.printf("구구단 %d단\n",num);
		System.out.println("---------------------");
		for (int i = 0; i < 9; i++) {
			System.out.printf("%d X %d = %d\n",num,(i+1),num*(i+1));
		}
		System.out.println("=====================");
		*/
		
		String dLine = String.format("%020", 0).replace("0", "=");
		Random rnd = new Random();
		int num = rnd.nextInt(9)+1;
		
		System.out.println(dLine);
		System.out.printf("구구단 %d단\n",num);
		System.out.println(dLine);
		for (int i = 0; i < 9; i++) {
			System.out.printf("%d X %d = %d\n",num,(i+1),num*(i+1));
		}
		System.out.println(dLine);
	}
}
