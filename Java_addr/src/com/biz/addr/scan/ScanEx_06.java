package com.biz.addr.scan;

import java.util.Scanner;

public class ScanEx_06 {
	public static void main(String[] args) {
		
		System.out.println(3 + 4);
		System.out.println(""+ 3 + 4);
		
		/*
		 * Scanner를 사용하여 nextInt(), nextLine()메서드를 섞어 사용하면
		 * 내부 문제로 인한 의도하지 않는 코드 진행이 되어
		 * 숫자, 문자 모두 문자열을 입력받는 nextLine() 메서드로 통일하여 사용한다.
		 * 
		 * 
		 * 의 내부문제에 의한코드 진행의 문제를 해결하기 위해
		 * 키보드로 부터 값을 읽는 를 만 사용하기로 하였다
		 * 그런데 숫자를 2개 입력받아 덧셈을 수행한 후
		 * 결과를 보고 싶은 
		 * 
		 * 만약 
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자1 >> ");
		String strNum1 = scan.nextLine();
		
		// Integer.valueOf() 메서드를 사용하여 숫자형으로 된 문자열 데이터를 정수형 데이터로 변환 
		int intNum1 = Integer.valueOf(strNum1);
		
		System.out.println("숫자2 >> ");
		String strNum2 = scan.nextLine();
		int intNum2 = Integer.valueOf(strNum2);
		
		System.out.println(strNum1+strNum2);
		System.out.printf("%d + %d = %d ",intNum1 , intNum2, intNum1 + intNum2);
		
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
