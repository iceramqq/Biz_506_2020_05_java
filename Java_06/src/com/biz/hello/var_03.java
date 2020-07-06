package com.biz.hello;

import java.util.Random;

public class var_03 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int num = rnd.nextInt((10) + 1) * 100;
		System.out.println("Vat 포함가격 제외 값:" + num);
		System.out.println("Vat 별도가격 제외 값:" + (int)(num / 1.1));
		System.out.println("Vat:" + (num-(int)(num / 1.1)));

	}

}
