package com.biz.grade;

import java.util.Random;

/*
 * 20명 학생의 국어 영어 수학 음악 점수를 저장하기 위한 배열선언
 * 각 배열에 51~100점의 점수를 생성하여 저장
 * 각 학생의 점수 총점 평균을 계산하고
 * 과목별 점수 총점 평균을 계산하여
 * 성적리스트를 콘솔에 표시하시오
 */
public class array_01 {
	public static void main(String[] args) {

		// 20개의 저장공간을 가진 변수를 선언
		// integer 형 배열 20개를 선언 : 20개의 저장공간을 가진 변수
		// intkor라는 배열을 20(개의 저장공간)갖는 integer형 배열을 생성
		int[] intKor = new int[20];
		int[] intEng = new int[20];
		int[] intMath = new int[20];
		int[] intMusic = new int[20];

		// 임의의 숫자를 생성하기위한 도구를 선언하기
		// random 클래스를 이용하여 rnd 라는 변수를 선언하고
		// new random 초기화 코드를 사용해서 사용준비
		Random rnd = new Random();
		//
		rnd.nextInt();
		//
		rnd.nextInt();
		/*
		 * 위해서 생성한
		 * 
		 * 
		 * 
		 * 배열[0]~[19]까지의 저장공간에 값을 활당 하기 위해 시작하는 반복문코드 
		 * intKor[0]~intKor[19] .... 
		 * 이러한 위치가
		 * 지정된 변수에 임의 저장값을 생성하여 활당한다 성적처리를 테스트하기 위한 
		 * 임의점수를 만들어서 배열에 저장하는 코드
		 */
		for (int i = 0; i < 20; i++) {
			intKor[i] = rnd.nextInt(50) + 51;
			intEng[i] = rnd.nextInt(50) + 51;
			intMath[i] = rnd.nextInt(50) + 51;
			intMusic[i] = rnd.nextInt(50) + 51;
		}

		// 과목별로 총점을 계산하여 보관할 변수를 선언
		int intSumKor = 0;
		int intSumEng = 0;
		int intSumMath = 0;
		int intSumMusic = 0;
		for (int i = 0; i < 10; i++) {
			intSumKor += intKor[i];
			intSumEng += intEng[i];
			intSumMath += intMath[i];
			intSumMusic += intMusic[i];
		}
		// ================================================
		// 국어 영어 수학 음악 총점
		// ------------------------------------------------
		// intkor[0] +inteng[0] +intmath[0] +intmusic[0]= intstsum[0]
		// ....

		// 학생들의 과목별 총점을 계산하여 저장할 배열을 또 20개 선언
		int[] intStSum = new int[20];
		for (int i = 0; i < 20; i++) {
			// 총점배열에 학생들의
			intStSum[i] = intKor[i];
			intStSum[i] += intEng[i];
			intStSum[i] += intMath[i];
			intStSum[i] += intMusic[i];
		}

		System.out.println("==================================================================================");
		System.out.println("국어\t\t영어\t\t수학\t\t음악\t\t총점");
		System.out.println("----------------------------------------------------------------------------------");
		for (int i = 0; i < 20; i++) {
			System.out.printf("%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\n", intKor[i], intEng[i], intMath[i], intMusic[i],
					intStSum[i], intStSum[i] / 4);
		}

		System.out.println("----------------------------------------------------------------------------------");
		System.out.printf("%d\t\t%d\t\t%d\t\t%d\n", intSumKor, intSumEng, intSumMath, intSumMusic);
		System.out.printf("%d\t\t%d\t\t%d\t\t%d\n", intSumKor / 20, intSumEng / 20, intSumMath / 20, intSumMusic / 20);

	}

}
