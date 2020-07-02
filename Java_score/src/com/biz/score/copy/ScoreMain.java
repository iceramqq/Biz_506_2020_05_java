package com.biz.score.copy;

import com.biz.score.copy.scoreservice.ScoreService02;

public class ScoreMain {
	public static void main(String[] args) {
		ScoreService02 scoreService = new ScoreService02();
		while (true) {
			if(!scoreService.inputScore()) {
				break;
			}			
		}
		System.out.println("업무종료");
		scoreService.scoreList();
	}
}
