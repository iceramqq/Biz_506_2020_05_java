package com.biz.grade;

import java.util.Random;

/*
 * 학생 20명 5과목의 성적처리
 */

public class Grade_01 {
	
	public static void main(String[] args) {
		
		int stdCount=20;
		
		int[] intKor=new int[stdCount];
		int[] intEng=new int[stdCount];
		int[] intMath=new int[stdCount];
		int[] intMusic=new int[stdCount];
		int[] intArt=new int[stdCount];
		
		//임의의 점수를 만들기 위한 도구 생성
		Random rnd=new Random();
		
		//
		for(int i=0;i<stdCount;i++) {
			intKor[i]=rnd.nextInt(50)+51;
			intEng[i]=rnd.nextInt(50)+51;
			intMath[i]=rnd.nextInt(50)+51;
			intMusic[i]=rnd.nextInt(50)+51;
			intArt[i]=rnd.nextInt(100)+1;
		}
		
		// 학생별 총점 평균계산
		
		//학생별 총점 평균을 계산하여 저장할 배열 추가
		
		int[] stdSum=new int[stdCount];
		int[] stdAvg=new int[stdCount];
		
		for(int i=0;i<stdCount;i++) {
			stdSum[i]=intKor[i];
			stdSum[i]+=intEng[i];
			stdSum[i]+=intMath[i];
			stdSum[i]+=intMusic[i];
			stdSum[i]+=intArt[i];
			
			stdAvg[i]=stdSum[i]/5;
		}
		
		//20명 학생의 과목별 총점
		int intSumKor=0;
		int intSumEng=0;
		int intSumMath=0;
		int intSumMusic=0;
		int intSumArt=0;
		for(int i=0;i<stdCount;i++) {
			intSumKor+=intKor[i];
			intSumEng+=intEng[i];
			intSumMath+=intMath[i];
			intSumMusic+=intMusic[i];
			intSumArt+=intArt[i];
		}
		
		System.out.println("=======================================");
		System.out.println("학생 성적일람표");
		System.out.println("---------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t음악\t미술\t총점\t평균\n");
		System.out.println("---------------------------------------");
		for(int i=0;i<stdCount;i++) {
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\n",(i+1),intKor[i],intEng[i],intMath[i]
					,intMusic[i],intArt[i],stdSum[i],stdAvg[i]);
		}
		
		int intTalSum=intSumKor+intSumEng+intSumMath+intSumMusic+intSumArt;
		int intTalAvg=intTalSum/5;
		System.out.println("---------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%d\t%d\n","총점",intSumKor,intSumEng,intSumMath
				,intSumMusic,intSumArt,intTalSum,intTalAvg);
		System.out.println("---------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%d\t%d\n","평균",intSumKor/stdCount,intSumEng/stdCount,intSumMath/stdCount
				,intSumMusic/stdCount,intSumArt/stdCount,intTalSum/stdCount,intTalAvg/stdCount);
		
		
	}

}
