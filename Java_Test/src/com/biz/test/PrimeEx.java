package com.biz.test;

import java.util.Random;

public class PrimeEx {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] nums = new int[10];
		
		for (int i = 0; i < nums.length; i++) {
			/*
			 * rnd.nextInt(91) : 0~90까지의 정수생성
			 * 결과에 +10을 하면 10~100까지의 정수가 생성
			 * 그 값을 배열의 각 요소에 저장(활당)
			 */
			nums[i] = rnd.nextInt(91)+10;
		}
		
		/*
		 * 소수(prime)
		 * 1과 자기자신 이외의 수로는 나누어지지 않는 수
		 */
		for (int i = 0; i < nums.length; i++) {
			
			/*
			 * 반복문 준간에 이 조건문이 한번이라도 true가 되면
			 * nums[i] 에 저장된 값은 소수가 아니다.
			 */
			int j = 0;
			for (j = 2; j < nums[i]; j++) {
				if(nums[i]%j == 0) {
					//
					break;
				}
			}// j반복문 end
			if(j<nums[i]) {
				System.out.println(nums[i]+" : 소수가 아니다");
			} else {
				System.out.println(nums[i]+" : 소수");
			}
			// j 반복문이 모두 반복되고 여기 도착했으면 nums[i] 에 저장된 값은 소수가 된다.
			// 아니면 준간 break문을 만나서 도착했으면 nums[i]에 저장된 값은 소수가 아니다.
			
		}
	}
}
