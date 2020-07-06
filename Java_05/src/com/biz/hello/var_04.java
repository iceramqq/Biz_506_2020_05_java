package com.biz.hello;

public class var_04 {

	public static void main(String[] args) {

		int sum = 0;
		int num = 0;

		sum = sum + num;//um1:0
		sum = sum + ++num;//um1:1
		sum = sum + ++num;//um1:1
		sum = sum + ++num;//um1:1
		sum = sum + ++num;//um1:1
		sum = sum + ++num;//um1:1
		sum = sum + ++num;//um1:1
		sum = sum + ++num;//um1:1
		sum = sum + ++num;//um1:1
		sum = sum + ++num;//um1:1
		sum = sum + ++num;//um1:1
		sum = sum + ++num;//um1:1
		sum = sum + ++num;//um1:1
		sum = sum + ++num;//um1:1
		sum = sum + ++num;//um1:1
		sum = sum + ++num;//um1:1
		sum = sum + ++num;//um1:1
		sum = sum + ++num;//um1:1
		sum = sum + ++num;//um1:1

		System.out.printf("1부터 %d까지의 덧셈 : %d\n", num, sum);

	}

}
