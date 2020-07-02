package com.biz.score.copy.domain;

public class ScoreVO {
	
	/*
	 * 성적처리 과정에서 1학생의 성적을 담는
	 * 변수
	 * 클래스 라고한다.
	 * 클래스들을 클래스 라고 한다.
	 * 
	 * 필드변수를 로 설정하고 
	 * 필드변수에 접근 를 선언
	 * 
	 * 이러한 
	 */
	private String strNum = "";
	private int intKor = 0;
	private int intEng = 0;
	private int intMath = 0;
	private int intSum = 0;
	private float floatAvg = 0;
	
	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public int getIntKor() {
		return intKor;
	}
	
	// 성적은 0 ~ 100까지가 
	public boolean setIntKor(int intKor) {
		
		if(intKor < 0 || intKor > 100) {
			return false;
		}
		this.intKor = intKor;
		return true;
	}
	
	public int getIntEng() {
		return intEng;
	}
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	public int getIntMath() {
		return intMath;
	}
	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}
	public int getIntSum() {
		return intSum;
	}
	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}
	public float getFloatAvg() {
		return floatAvg;
	}
	public void setFloatAvg(float floatAvg) {
		this.floatAvg = floatAvg;
	}
	
	
}
