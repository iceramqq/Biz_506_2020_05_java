package com.biz.control;

public class for_06 {
	public static void main(String[] args) {

		int num = 0;
		int sum = 0;

		for (sum = 0, num = 0; num <= 10; num++) {
			sum += num;
		}
		System.out.println("결과:" + sum);
		
		//1부터 10까지 곱셈 결과
		for(sum=1,num=1;num<=10;num++) {
			sum=sum*num;
		}
		System.out.println("곱셈의 결과"+sum);
		
		
		
	}

}
