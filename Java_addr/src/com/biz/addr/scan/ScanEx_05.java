package com.biz.addr.scan;

import java.util.Scanner;

public class ScanEx_05 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자1 >> ");
		int num1 = scan.nextInt();
		
		System.out.println("숫자2 >> ");
		int num2 = scan.nextInt();
		System.out.printf("%d + %d = %d ",num1 , num2, num1 + num2);
		
		/*
		 * InputStream의 문제로 인하여
		 * 숫자를 하는 를 수행한 후 
		 * 곧바로 이어서 문자열을 하는 를 수행하면
		 * 내부 메커니즘이 문제로 인하여 에 코드가 남아 있다가 
		 * 곧바로 에게 전달되어 버린다.
		 * 니때문에 를 수행한 
		 */
		System.out.println("문자열을 입력 >> ");
		String strInput = scan.nextLine();
		System.out.println("입력된 문자열 : "+strInput);
		
		scan.close();
		
	}
}
