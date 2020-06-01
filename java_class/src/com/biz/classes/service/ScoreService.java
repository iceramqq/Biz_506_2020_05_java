package com.biz.classes.service;

import com.biz.classes.model.Score;

/*
 * 메서드의 중복정의
 * 
 * 메서드의 매개변수가 다르면 같은 이름의 메서드를
 * 한클래스 내에서 사용
 * 
 * 클래스를 모듈이라는 이름으로 불렸는데
 * 1개의 모듈, 1개의 파일내에서는
 * 같은 이름의 메서드를 정의 할수 없었다
 * java에서는 메서드의 매개변수 개수가 다르면
 * 같은 이름의 
 * 
 * 
 * 또한 메서드에 매개ㅕㄴ수 갯수가 같은 경우라도
 * 매개변수 type
 * 
 */
public class ScoreService {
	
	public int sum() {
		return 0;
		
	}
	
	public int sum(Score score) {
		
		int sum= score.getInKor();
		sum+=score.getInEng();
		sum+=score.getInMath();
		
		score.setInSum(sum);
		score.setInAvg(sum/3);
		return sum;
	}
	
	public int sum(int kor, int eng, int math,int music,int Art,int sci) {
		int sum=kor+eng+math+music+Art+sci;
		return sum;
	}
	
	public float sum(float kor, float eng, float math) {
		float sum=kor+eng+math;
		return sum;
	}
	
	public int sum(int kor, int eng, int math) {
		int sum=kor+eng+math;
		return sum;
	}
	
	public int sum(int kor, int eng) {
		return kor+eng;
	}
	
	public float sum(int kor, float eng) {
		return kor+eng;
	}
	
	public float sum(float kor, int eng) {
		return kor+eng;
	}
	


}
