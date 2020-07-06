package com.biz.control;

public class for_05 {
	public static void main(String[] args) {

		int num = 0;
		int sum = 0;
		for (;;) {
			num++;
			sum += num; // sum = sum + num의 축약형 명령문
			if (num >= 10) {
				break;
			}

		}
		System.out.println("결과:" + sum);

		num = 0;
		sum = 0;
		for (;;) {
			num++;
			sum += num; // sum = sum + num의 축약형 명령문
			if (num < 10) {

			} else {
				break;
			}

		}
		System.out.println("결과:" + sum);

		/*
		 * for 명령문은 두번째 세미콜론 앞의 연산식 for 조건문의 결과 값이 true이면 {} 내의 명령문을 실행하고 결과 값이 false이면
		 * 더이상 반복하지 않고 for()명령문을 종료 한다.
		 * 조건문은
		 * if(조건) {
		 * 
		 * } elsr {
		 * 
		 * break} 와 같은 역활을 수행한다.
		 */
		num = 0;
		sum = 0;
		for (; num < 10;) {
			num++;
			sum += num; // sum = sum + num의 축약형 명령문
		}
		System.out.println("결과:" + sum);

		/*
		 * for()명령문의 첫번째 세미콜 앞의 명령 for(초기화명령;조건문;) 초기화
		 * 
		 */
		// num = 0;
		// sum = 0;
		for (num = 0, sum = 0; num < 10;) {
			num++;
			sum += num; // sum = sum + num의 축약형 명령문
		}
		System.out.println("결과:" + sum);
		
		/*
		 * for()명령문의 세번째 명령문
		 * for(초기화명령; 조건문; 증감문)
		 * 
		 * 1.for() 면령문을 만나면
		 * 2.초기화명령을 무조건 실행 한다(단, 한번만)
		 * 3.조건문을 실행하여 결과가 true이면{} 명령문을 실행
		 * 4.{}명령문을 실행한 후 for명령문으로 이동하여
		 * 5.증감 명령문을 실행한다
		 * 6.다시 실행한 결과가 true인지 검사한다
		 * 그리고 계속해서 반복하거나, 중단한다
		 */

		for (num = 0, sum = 0; num < 10; num++) {
			sum += num; // sum = sum + num의 축약형 명령문
		}
		System.out.println("결과:" + sum);

	}

}
