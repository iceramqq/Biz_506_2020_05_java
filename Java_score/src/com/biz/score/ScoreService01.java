package com.biz.score;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreService01 {
	private List<ScoreVO> scoreList;
	private Scanner scan;
	
	public ScoreService01() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);	
	}
	
	public void inputScore() {
		
		System.out.println("학번(중단:END) >> ");
		String strNum = scan.nextLine();
		
		if(strNum.equals("END")) {
			return false;
		}
		
		
		System.out.println("국어 >> ");
		String strKr = scan.nextLine();
		
		System.out.println("영어 >> ");
		String strEn = scan.nextLine();
		
		System.out.println("수학 >> ");
		String strMath = scan.nextLine();
		
		System.out.println("총합 >> ");
		String strSum = scan.nextLine();
		
		System.out.println("평균 >> ");
		String strAvg = scan.nextLine();
		
		ScoreVO scoreVO = new ScoreVO(strNum, strKr, strEn, strMath, strSum, strAvg);
		scoreList.add(scoreVO);
		
	}
}
