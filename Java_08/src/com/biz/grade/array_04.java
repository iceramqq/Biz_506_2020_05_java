package com.biz.grade;

public class array_04 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				System.out.printf("%d\n", i);
			} else {
				System.out.printf("%d\t", i);
			}
		}
		
		for (int i = 1; i <= 100; i++) {
			System.out.printf("%d\t", i);
			if (i % 5 == 0) {
				System.out.println();
			}
		}
	}
}
