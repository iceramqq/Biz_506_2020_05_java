package com.biz.score.copy.scoreservice;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.score.copy.domain.ScoreVO;

public class ScoreService02 {
	
	// 성적리스트를 저장하기 위한 객체
	List<ScoreVO> scoreList;
	
	//키보드를 사용하여 
	Scanner scan;
	
	
	// 이과정을 생략하면
	public ScoreService02() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);	
	}
	
	// 한학생의 성적을 입력받아서 에 추가하는 메서드
	// 변경
	// 학생의 성적을 입력받는 과정에서 학번에 END라는 문자열을
	// 입력하게 되면 성적 입력을 중단하도록 변경
	public boolean inputScore() {
		ScoreVO scoreVO = new ScoreVO();
		
		System.out.print("학번>> ");
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
			System.out.println("국어는 숫자만 가능!!");
		}
		
		// intKor는 0인 상태로 유지가 된다.
		if(!scoreVO.setIntKor(intKor)) {
			System.out.println("국어점수는 0~100가지만 가능");
			System.out.println("국어점수 임시로 0으로 세팅");
		};
		
		System.out.print("영어 >> ");
		String strEng = scan.nextLine();
		int intEng= 0;
		try {
			intEng = Integer.valueOf(strEng);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("영어는 숫자만 가능!!");
		}
		
		System.out.print("수학 >> ");
		String strMath = scan.nextLine();
		int intMath= 0;
		try {
			intMath = Integer.valueOf(strMath);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("수학은 숫자만 가능!!");
		}
		
		// int형으로 변환된 점수를 에 일단 담기
		
		scoreVO.setStrNum(strNum);
		
		scoreVO.setIntEng(intEng);
		scoreVO.setIntMath(intMath);
		
		// 총점계산
		int intSum = scoreVO.getIntKor()
				+ scoreVO.getIntEng()
				+ scoreVO.getIntMath();
		
		float floatAvg = (float)intSum/3;
		
		scoreVO.setIntSum(intSum);
		scoreVO.setFloatAvg(floatAvg);
		
		// 한학생의 성적 입력받아 scoreList에 담기 완료
		scoreList.add(scoreVO);
		
		
		return true;
		
	}
	
	public void scoreList() {

		
		System.out.println("============================================");
		System.out.println("성적일람표");
		System.out.println("============================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("--------------------------------------------");
		
		
		// scoreList개수가 몇개인지 파악하여 변수에 저장
		int scoreSize =scoreList.size();
		
		for (int i = 0; i < scoreSize; i++) {
			// list에서 ScoreVO를 추출한다
			ScoreVO sVO = scoreList.get(i); 
			System.out.print(sVO.getStrNum()+"\t");
			System.out.print(sVO.getIntKor()+"\t");
			System.out.print(sVO.getIntEng()+"\t");
			System.out.print(sVO.getIntMath()+"\t");
			System.out.print(sVO.getIntSum()+"\t");
			System.out.print(sVO.getFloatAvg()+"\n");
		}
		
	}
}
