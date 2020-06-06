package com.biz.list.service;

import java.util.List;

import com.biz.list.model.ScoreVO;

public class ScoreServiceV2 {

	private List<ScoreVO> scoreList;
	ScoreVO getscoreVO;

	public void stSum(List<ScoreVO> scoreList) {
		this.scoreList = scoreList;
		int scoreSize = scoreList.size();
		for (int i = 0; i < scoreSize; i++) {
			getscoreVO = scoreList.get(i);
			getscoreVO.setStSum(getscoreVO.getKor() + getscoreVO.getEng() + getscoreVO.getMath());
		}
	}

	public void stAvg() {
		int scoreSize = scoreList.size();
		for (int i = 0; i < scoreSize; i++) {
			getscoreVO = scoreList.get(i);
			getscoreVO.setStAvg(getscoreVO.getStSum() / 3);
		}
	}

	LineService line = new LineService();

	public void scoreLisr() {
		int listNum = 60;
		System.out.println(line.do_line(listNum));
		System.out.println("성적리스트");
		System.out.println(line.do_line(listNum));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println(line.single(listNum));
		int scoreSize = scoreList.size();
		for (int i = 0; i < scoreSize; i++) {
			getscoreVO = scoreList.get(i);
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\n", getscoreVO.getNum(), getscoreVO.getKor(), getscoreVO.getEng(),
					getscoreVO.getMath(), getscoreVO.getStSum(), getscoreVO.getStAvg());
		}
		System.out.println(line.do_line(listNum));
	}

}
