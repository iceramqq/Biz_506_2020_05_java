package com.biz.addr.scan;

import java.io.InputStream;
import java.util.Scanner;

public class ScanEx_02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("영문자열 입력 >> ");
		
		String strInput = scan.nextLine();
		
		System.out.println("입력된 문자열 : "+strInput);
		
	}
}
