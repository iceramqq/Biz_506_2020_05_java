package com.biz.hello;

public class var_07 {
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			System.out.printf("%d 단 구구단\n",i);

			for (int j = 2; j < 10; j++) {
				System.out.printf("%dx%d=%d\n", i, j, i * j);
			}
			System.out.println("========================");
		}
	}

}
