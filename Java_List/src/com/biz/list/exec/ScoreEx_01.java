package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.list.model.ScoreVO;

public class ScoreEx_01 {
	
	/*
	 * 클래스를 리스트에 추가하기
	 * 리스트에서 클래스 읽기
	 */
	public static void main(String[] args) {
		
		//1.size() 0인 리스트를 생성
		List<ScoreVO> scoreList=new ArrayList<ScoreVO>();
		
		//2.클래스를 인스턴스로 선언과 생성
		ScoreVO scoreVO=new ScoreVO();
		
		//3.
		scoreVO.setNum("001");
		scoreVO.setKor(80);
		scoreVO.setEng(70);
		scoreVO.setMath(88);
		//4.리스트에 추가
		scoreList.add(scoreVO);
		//size() 1인 리스트에 
		
		//
		//5.
		scoreVO=new ScoreVO();
		scoreVO.setNum("002");
		scoreVO.setKor(99);
		scoreVO.setEng(88);
		scoreVO.setMath(77);
		scoreList.add(scoreVO);
		
		scoreVO=new ScoreVO();
		scoreVO.setNum("003");
		scoreVO.setKor(77);
		scoreVO.setEng(66);
		scoreVO.setMath(55);
		scoreList.add(scoreVO);
		
		//값을 읽을때
		//1.리스트의 위치를 지정하여 get(0 method로
		//	인스턴스를 추출하여 다른 인스턴스에 저장
		ScoreVO grtScore=scoreList.get(0);
		
		String num =grtScore.getNum();
		int kor =grtScore.getKor();
		int eng =grtScore.getEng();
		int math =grtScore.getMath();
		
		int scoreSize=scoreList.size();
		for(int i=0;i<scoreSize;i++) {
			grtScore=scoreList.get(i);
			System.out.println(grtScore);
			System.out.println(grtScore);
			System.out.println(grtScore);
		}
		
		
		
	}
	

}
