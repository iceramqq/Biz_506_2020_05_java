package com.biz.hello;

import java.util.Random;

public class var_05 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int num = rnd.nextInt(100) + 1;

		int index = 0;
		for (index = 2; index < num; index++) {
			/*
			 * num와 index 값을 니누어 나머지가 0인 경우가 있는지
			 */
			if (num % index == 0) {
				break;
			}
		}
		System.out.println(num);
		System.out.println(index);
		/*
		 * num%index==0인 조건이 한번이라도 있다면 for 반복문은 중단될 것이고 
		 * 
		 * 이러한 성질을 이용하여 for 반복문이 끝 난다음 index와 num 값을 비교하여 num가 소수인지, 아닌지 알수있다
		 */
		if (num > index) {
			System.out.println(num + "는 소수가 아님");
		} else {
			System.out.println(num + "는 소수");
		}

	}

}
