package com.biz.score.exec;

import java.util.Random;

import com.biz.score.service.ScoreServiceV1;
import com.biz.score.service.ScoreServiceV2;
import com.biz.score.vo.ScoreVO;

public class ScoreEx_01 {

	public static void main(String[] args) {

		ScoreVO[] scores = new ScoreVO[10];

		Random rnd = new Random();

		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreVO();//초기화 코드
			scores[i].setNum("" + (i + 1));
			scores[i].setKor(rnd.nextInt(50) + 51);
			scores[i].setEng(rnd.nextInt(50) + 51);
			scores[i].setMath(rnd.nextInt(50) + 51);
			scores[i].setMusic(rnd.nextInt(50) + 51);
		}
		
		ScoreServiceV1 scoreService=new ScoreServiceV1();
		
		/*
		 * ScoreServiceV1에 선언되어 있는 ScoreVO[] scores는
		 * 아직 선언만 되고 초기화 등이 전혀 이루어지지 않은 상태이다
		 *  
		 * 
		 */
		
		scoreService.setScores(scores);
		scoreService.scoreSum();
		scoreService.scoreAvg();
		scoreService.scoreList();
		

		/*
		 * ScoreServiceV1에서는 배열을 주입하는 메서드
		 * 라고 별도로 작성해 주었는데
		 * 사용하기 위해 작성을 하는 가정에서
		 * 를 먼저 호출헤서 를 전달
		 * 
		 * ScoreServiceV2에서는
		 * 성적처리를 하는 과정에서 반드시 홏ㄹ할 수 밖에 없는
		 * 메서드들 중에
		 * 호출디는 순서로 
		 * 
		 */
		ScoreServiceV2 sService2=new ScoreServiceV2();
		sService2.scoreSum(scores);
		sService2.scoreAvg();
		sService2.scoreList();
		
		
		
	}
}
