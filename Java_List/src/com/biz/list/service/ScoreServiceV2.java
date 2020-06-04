package com.biz.list.service;

import java.util.List;

import com.biz.list.model.ScoreVO;

public class ScoreServiceV2 {
	
	private List<ScoreVO> scoreList;
	
	public void stSum(List<ScoreVO> scoreList) {
		this.scoreList=scoreList;
		int scoreSize=scoreList.size();
		for(int i=0;i<scoreSize;i++) {
			ScoreVO scoreVO=scoreList.get(i);
			scoreVO.setStSum(scoreVO.getKor()
					+scoreVO.getEng()
			        +scoreVO.getMath());
		}
	}
	
	public void stAvg() {
		int scoreSize=scoreList.size();
		for(int i=0;i<scoreSize;i++) {
			ScoreVO scoreVO=scoreList.get(i);
			scoreVO.setStAvg(scoreVO.getStSum()/3);
		}
	}
	
	
	
}
