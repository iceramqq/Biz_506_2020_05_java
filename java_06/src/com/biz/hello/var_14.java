package com.biz.hello;

import java.util.Random;

public class var_14 {
	public static void main(String[] args) {
		int sum = 0;
		Random rnd = new Random();
		for (int i = 0; i < 100; i++) {
			int num = rnd.nextInt(100) + 1;
			if (num % 2 == 0) {
				sum += num;
			}
		}
		System.out.println("100개의 임의 수중 짝수인 합들의 수:" + sum);
	}
}
