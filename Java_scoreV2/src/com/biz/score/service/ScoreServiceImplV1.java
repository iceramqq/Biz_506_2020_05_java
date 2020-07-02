package com.biz.score.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.score.domain.ScoreVO;

/*
 * ScoreService***클래스를 정의할대
 * 반드시 ScoreService interface를 참조 하도록 규칙을 정해 놓는다
 * ScoreService interface를 참조하는 클래스는 ScoreService interface에 디자인된
 * 메서드를 모두 implement해서 작성되어야 하는 규칙이 작동하게 된다.
 * 따라서 모든 메서드의 이름이 통일되는 효과를 얻게 된다.
 * 
 * 를 하여 작성된 클래스는
 * 에 정의된 의 규칙을 그대로 준수하여 작성해야할 
 */
public class ScoreServiceImplV1 implements ScoreService {
	
	// private 되어 있던 
	protected List<ScoreVO> scoreList;
	protected Scanner scan;
	
	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}

	@Override
	public boolean inputScore() {
		// TODO Auto-generated method stub
		ScoreVO scoreVO = new ScoreVO();
		
		System.out.print("학번(end:입력종료)>> ");
		String strNum = scan.nextLine();
		if(strNum.equals("end")) {
			return false;
		}
		
		System.out.print("국어>> ");
		String strKor = scan.nextLine();
		int intKor = 0;
		try {
			intKor = Integer.valueOf(strKor);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("국어점수는 숫자만 가능!!");
		}
		
		System.out.print("영어>> ");
		String strEng = scan.nextLine();
		int intEng = 0;
		try {
			intEng = Integer.valueOf(strEng);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("영어점수는 숫자만 가능!!");
		}
		
		System.out.print("수학>> ");
		String strMath = scan.nextLine();
		int intMath = 0;
		try {
			intMath = Integer.valueOf(strMath);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("수학점수는 숫자만 가능!!");
		}
		scoreVO.setNum(strNum);
		scoreVO.setKor(intKor);
		scoreVO.setEng(intEng);
		scoreVO.setMath(intMath);
		
		/*
		int intSum = 0;
		intSum = scoreVO.getKor();
		intSum += scoreVO.getEng();
		intSum += scoreVO.getMath();
		
		scoreVO.setSum(intSum);
		
		float floatAvg = 0.0f;
		floatAvg = (float) scoreVO.getSum() / 3;
				
		scoreVO.setAvg(floatAvg);
		*/
		
		scoreList.add(scoreVO);
		
		return true;
	}

	@Override
	public void calcSum() {
		// TODO Auto-generated method stub
		int size = scoreList.size();
		for (int i = 0;i<size;i++) {
			ScoreVO sVO = scoreList.get(i);
			int sum = sVO.getKor();
			    sum += sVO.getEng();
			    sum += sVO.getMath();
			    /*
			     * sVO.setSum() 메서드에 총점을 전달하므로써
			     * scoreList에 저장된 요소의 총점 변수에 값을 저장하는 효과를 낸다
			     * 별도로 저장을 해주거나 하는 절차가 필요없다.
			     */
			sVO.setSum(sum);
		}
		
	}

	@Override
	public void calcAvg() {
		// TODO Auto-generated method stub
		int size = scoreList.size();
		for (int i = 0;i<size;i++) {
			ScoreVO sVO = scoreList.get(i);
			float avg = (float) sVO.getSum() / 3;
			sVO.setAvg(avg);
		}
	}

	@Override
	public void scoreList() {
		// TODO Auto-generated method stub
		System.out.println("=============================================================");
		System.out.println("성적일람표");
		System.out.println("=============================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------------------------------");
		int size = scoreList.size();
		for (int i = 0;i<size;i++) {
			ScoreVO VO = scoreList.get(i);
			System.out.print(VO.getNum()+"\t");
			System.out.print(VO.getKor()+"\t");
			System.out.print(VO.getEng()+"\t");
			System.out.print(VO.getMath()+"\t");
			System.out.print(VO.getSum()+"\t");
			System.out.print(String.format("%.2f", VO.getAvg())+"\n");
		}
		System.out.println("=============================================================");		
	}
	
}
