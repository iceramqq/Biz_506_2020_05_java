package com.biz.grade;

public class array_03 {
	
	/*
	 * 1~100까지의 범위의 수중 짝수의 개수는 몇 개인가
	 * 1~100까지의 범위의 수중 3의 배수의 개수는 몇 개인가
	 */
	public static void main(String[] args) {
		
		int intCount=0;
		int intSum=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				intSum+=i;
				intCount++;
			}
		}
		System.out.println("짝수의 개수 : "+intCount);
		System.out.println("짝수의 합 : "+intSum);
		
		intCount=0;
		intSum=0;
		for(int i=2;i<=100;i++) {
			if(i%3==0) {
				intSum+=i;
				intCount++;
			}
		}
		
		System.out.println("3의 배수의 개수 : "+intCount);
		System.out.println("3의 배수의 합 : "+intSum);
		
	}

}
