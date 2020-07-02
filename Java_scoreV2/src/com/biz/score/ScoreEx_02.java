package com.biz.score;

import com.biz.score.service.ScoreService;
import com.biz.score.service.ScoreServiceImplV1;

public class ScoreEx_02 {
	public static void main(String[] args) {
		
		// 를 사용하여 객체를 정의하고
		// 실제 코드는 클래스의 메서드에 구현된 코드를 사용한다.
		ScoreService sService = new ScoreServiceImplV1();
		while (true) {
			if(!sService.inputScore()) {
				break;
			}
		}
		sService.calcSum();
		sService.calcAvg();
		sService.scoreList();
		
	}

}
