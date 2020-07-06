package com.biz.service;

import com.biz.model.ScoreVO;

public class ScoreServiceV1 {
	
	public void scoreList(ScoreVO[] score) {
		
		LineService lineService=new LineService();
		String d_Line=lineService.do_line(50);
		String s_Line=lineService.single(50);
		System.out.println(d_Line);
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(s_Line);
		for(int i=0;i<score.length;i++) {
			
			//for(){}내에서 선언된 sum,avg 변수는
			//for(){}명령문이 종료되면 이후에 참조할수 없다
			int sum=score[i].getKor();
			sum+=score[i].getEng();
			sum+=score[i].getMath();
			int avg=sum/3;
			
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\n",
					score[i].getName(),
					score[i].getKor(),
					score[i].getEng(),
					score[i].getMath(),
					sum,
					avg
					);
		}
		System.out.println(d_Line);
		
		
		
	}

}
