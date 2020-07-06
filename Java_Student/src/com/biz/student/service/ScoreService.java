package com.biz.student.service;

/*
 * 총점과 평균을 계산
 * 
 * 학생별 과목, 총점, 평균 리스트 출력
 */
public interface ScoreService {
	
	public void inputStudent();
	public void inputScore();
	
	public void calcSum();
	public void calcAvg();
	
	/*
	 * ==============================================================
	 * 성적일람표
	 * ==============================================================
	 * 학번 이름 국어 영어 수학 총점 평균
	 * --------------------------------------------------------------
	 */
	public void scoreList();
	
	
}
