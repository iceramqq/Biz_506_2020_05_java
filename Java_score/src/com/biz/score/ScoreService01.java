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
	
	public boolean inputScore() {
		
		System.out.print("학번(중단:END) >> ");
		String strNum = scan.nextLine();
		
		if(strNum.equals("END")) {
			return false;
		}
		
		
		System.out.print("국어 >> ");
		String strKor = scan.nextLine();
		int intKor= 0;
		try {
			intKor = Integer.valueOf(strKor);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("숫자만 입력 가능합니다");
			System.out.println("입력이 잘못되어 0으로 임시 저장합니다");
		}
		
		System.out.print("영어 >> ");
		String strEng = scan.nextLine();
		int intEng= 0;
		try {
			intEng = Integer.valueOf(strEng);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("숫자만 입력 가능합니다");
			System.out.println("입력이 잘못되어 0으로 임시 저장합니다");
		}
		
		System.out.print("수학 >> ");
		String strMath = scan.nextLine();
		int intMath= 0;
		try {
			intMath = Integer.valueOf(strMath);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("숫자만 입력 가능합니다");
			System.out.println("입력이 잘못되어 0으로 임시 저장합니다");
		}
		
		
		int intSum = intKor
			   + intEng
			   + intMath;
		
		int intAvg = intSum/3;
		
		ScoreVO scoreVO = new ScoreVO(strNum, intKor, intEng, intMath, intSum, intAvg);
		scoreList.add(scoreVO);
		
		return true;
		
	}
	
	public void scoreList() {

		
		System.out.println("============================================");
		System.out.println("성적리스트");
		System.out.println("--------------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("--------------------------------------------");
		
		int scoreSize =scoreList.size();
		
		for (int i = 0; i < scoreSize; i++) {
			ScoreVO vo = scoreList.get(i); 
			System.out.print(vo.getStrNum()+"\t");
			System.out.print(vo.getIntKor()+"\t");
			System.out.print(vo.getIntEng()+"\t");
			System.out.print(vo.getIntMath()+"\t");
			System.out.print(vo.getIntSum()+"\t");
			System.out.print(vo.getIntAvg()+"\n");
		}
		
	}
}
