package com.biz.score;

public class ScoreEx {
	public static void main(String[] args) {
		ScoreService01 scoreService = new ScoreService01();
		while (true) {
			if(!scoreService.inputScore()) {
				break;
			}			
		}
		scoreService.scoreList();
		System.out.println("업무종료");
	}
}
