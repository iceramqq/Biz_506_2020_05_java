package com.biz.list.service;

import java.util.List;

import com.biz.list.model.ScoreVO;

public class ScoreServiceV1 {
	
	/*
	 * 
	 * 성적리스트를 출력한다
	 */
	public void scoreList(List<ScoreVO> scores) {
		
		System.out.println("=============================================");
		System.out.println("성적일람표");
		System.out.println("---------------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t총점\n");
		System.out.println("---------------------------------------------");
		
		int scoreSize=scores.size();
		for(int i=0;i<scoreSize;i++) {
			ScoreVO sVO=scores.get(i);
			System.out.print(sVO.getNum()+"\t");
			System.out.print(sVO.getKor()+"\t");
			System.out.print(sVO.getEng()+"\t");
			System.out.print(sVO.getMath()+"\t");
			
			int sum=sVO.getKor();
			sum+=sVO.getEng();
			sum+=sVO.getMath();
			
			System.out.println(sum);
			
		}
		System.out.println("==============================================");
		
		
		
	}

}
