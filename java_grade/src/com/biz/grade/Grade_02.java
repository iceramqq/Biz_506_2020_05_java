package com.biz.grade;

import java.util.Random;

/*
 * 학생 20명, 5과목의 성적 처리
 */
public class Grade_02 {

	public static void main(String[] args) {

		int stdCount = 20;// 학생의 수
		int subCount = 5+2;// 과목5개와 총점, 평균을 저장할 배열
		
		/*
		 
		배열을 정해진 개수만큼 선언하고
		String[] subTitle=new String[5];
		
		
		subTitle[0]="국어";
		*/
		
		/*
		 * 배열을 선언할때 보관할 값의 개수가 얼마인지 확실치 않을때
		 * 배열을 빈 크기만큼만 선언하고
		 * 를 사용하여, 값을 미리 저장하는 방법
		 * 이 방법을 사용하면, 배열의 개수가 변동될 때
		 * 배열에 저장되는 값을 추가, 삭재하므로써 자동으로 배열이 생성된다
		 * 
		 *  
		 */
		String[] subTitle=new String[] {
				"학번","국어","영어","수학","음악","미술","총점","평균"
		};
		
		// score
		// int[][] score : score배열을 가로세로 방향으로 선언하겠다
		// 2차원 배열
		// 20x5개의 공간을 갖는 2차원 배열로 선언
		int[][] score = new int[stdCount][subCount];

		// score[0]=new int[subCount];
		// score[1]=new int[subCount];
		// score[3]=new int[subCount];

		// 세로방향 5번위치, 가로방향 2번위치
		score[5][2] = 90;

		Random rnd = new Random();

		// index 줄여서 임시로 사용하기 위한 변수명
		for (int i = 0; i < stdCount; i++) {

			for (int j = 0; j < subCount; j++) {
				// 0,0~0,4
				// 1,0~1,4
				// ~ ~ ~
				// 19,0~19,4
				score[i][j] = rnd.nextInt(50) + 51;
			}
		}
		
		System.out.println("========================================");
		System.out.println("성적일람표");
		System.out.println("----------------------------------------");
		
		/*
		 * 배열.length : 
		 */
		for (int i = 0; i < subTitle.length; i++) {
			System.out.printf("%s\t",subTitle[i]);
		}
		System.out.println("\n------------------------------------------");
		
		for (int i = 0; i < stdCount; i++) {
			
			System.out.printf("%d\t",(i+1));
			for (int j = 0; j < subCount; j++) {
				System.out.printf("%d\t",score[i][j]);
			}
			System.out.println();
		}
		
		

	}

}
