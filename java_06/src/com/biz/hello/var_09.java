package com.biz.hello;

public class var_09 {

	public static void main(String[] args) {

		int sum=0;
		for (int i = 0; i < 10; i++) {
			if (i % 3 == 0) {
				System.out.println(i + "는 3의 배수");
				sum+=i;
			}
		}
		System.out.printf("3의 배수의 합:%d\n",sum);
	}
}
