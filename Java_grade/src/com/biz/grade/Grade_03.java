package com.biz.grade;

import java.util.Random;

/*
 * 학생 20명, 5과목의 성적 처리
 */
public class Grade_03 {

	public static void main(String[] args) {
		
		int stdCount = 20;// 학생의 수
		int subCount = 5+2;// 과목5개와 총점, 평균을 저장할 배열
		Random rnd = new Random();

		//값으로 배열선언하기
		//배열을 값으로 선언할때는 {}끝에 반드시;을붙여라
		String[] subTitle=new String[] {
				"학번","국어","영어","수학","음악","미술",
				"총점","평균"
		};
		
		//stdCount x subCount 개의 ㅗㅇ간을 갖는 2차원 배열로 선언
		int[][] score = new int[stdCount][subCount];

		
		// 과목 점수를 채워넣는 곳
		for (int i = 0; i < stdCount; i++) {
			
			//총점 항목과 평균항목을 제외하고 과목부분만 점수를 쳐워넣기
			for (int j = 0; j < subCount-2; j++) {
				score[i][j] = rnd.nextInt(50) + 51;
			}
		}
		
		
		//과목별 총점과 평균
		//score[i][개수의-2] : 총점
		//score[i][개수의-1] : 평균
		for (int i = 0; i < stdCount; i++) {

			for (int j = 0; j < subCount - 2; j++) {
				score[i][subCount - 2] += score[i][j];
				//score[i][subCount - 1] = score[i][subCount - 2] / (subCount - 2);
			}
			//총점을 무두 계산한 후에 평균을 구하자
			score[i][subCount - 1] = score[i][subCount - 2] / (subCount - 2);

		}
		
		//학생별 총점, 평균을 계산하여 보관할 배열 선언
		int[][] intTotal=new int[2][subCount];
		
		//이중 for문이 반복되는 방향이
		//
		//각 과목을 지정하는 반복이
		for(int i=0;i<subCount;i++) {
			
			//
			for(int j=0;j<stdCount;j++) {
				intTotal[0][i]+=score[j][i];
			}
		}
		
		
		
		
		System.out.println("===================================================");
		System.out.println("성적일람표");
		System.out.println("---------------------------------------------------");
		
		for (int i = 0; i < subTitle.length; i++) {
			System.out.printf("%s\t",subTitle[i]);
		}
		System.out.println("\n-------------------------------------------------");
		
		for (int i = 0; i < stdCount; i++) {
			
			System.out.printf("%d\t",(i+1));
			for (int j = 0; j < subCount; j++) {
				System.out.printf("%d\t",score[i][j]);
			}
			System.out.println();
		}
		//힉생별 총점 출력
		System.out.println("---------------------------------------------------");
		System.out.print("총점\t");
		for(int i=0;i<subCount;i++) {
			System.out.printf("%d\t",intTotal[0][i]);
		}
		
		//힉생별 평균 출력
		System.out.println();
		System.out.println("---------------------------------------------------");
		System.out.print("평균\t");
		for(int i=0;i<subCount;i++) {
			System.out.printf("%d\t",intTotal[0][i]/stdCount);
		}
		System.out.println();

	}

}
