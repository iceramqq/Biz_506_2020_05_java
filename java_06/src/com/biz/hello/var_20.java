package com.biz.hello;

import java.util.Random;

public class var_20 {
	public static void main(String[] args) {
		Random rnd =new Random();
		int sum=0;
		int index=0;
		//임의수 10개를 만들어서 sum변수에 덧셈하기
		for(index=1;index<10;index++) {
			sum+=rnd.nextInt(50)+51;
		}
		/*index변수는 for
		 * 
		 * 평균을 구할때 직접 숫자를 사용하지 않고 
		 *
		 * 
		 */
		System.out.println("총점"+sum);
		System.out.println("평균"+sum/index);
	}

}
