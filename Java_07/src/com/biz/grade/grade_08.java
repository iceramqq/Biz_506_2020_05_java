package com.biz.grade;

import java.util.Random;

public class grade_08 {
	
	public static void main(String[] args) {
		
		Random random=new Random();
		int[] intKorScore=new int[10];
		
		intKorScore[0]=random.nextInt(50)+51;
		intKorScore[1]=random.nextInt(50)+51;
		intKorScore[2]=random.nextInt(50)+51;
		intKorScore[3]=random.nextInt(50)+51;
		intKorScore[4]=random.nextInt(50)+51;
		intKorScore[5]=random.nextInt(50)+51;
		intKorScore[6]=random.nextInt(50)+51;
		intKorScore[7]=random.nextInt(50)+51;
		intKorScore[8]=random.nextInt(50)+51;
		intKorScore[9]=random.nextInt(50)+51;
		
		
		/*
		 * intKorScore배열을 10개샹성하여
		 * 각 변수에 점수를 저장하려고 명령을 수행하는 과정에서
		 * ArrayIndexOutOfBoundsException 이 발생을 했다
		 * 	그 이유는 배열은 10개만 생성되어
		 * 실제 인덱스 값은 0~9까지 만 사용할수 있다
		 * 
		 */
		intKorScore[10]=random.nextInt(50)+51;
		
		
		
	}

}
