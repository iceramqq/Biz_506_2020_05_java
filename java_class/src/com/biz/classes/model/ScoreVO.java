package com.biz.classes.model;

/*
 * 클래스 작성 목적1
 * 
 * 
 * VO 클래스
 * 메서드에게 보낼 매개변수가 많을 경우
 * 일일이 매개변수를 개별적으로 전달하는 것 보다는
 * 매개변수들을 모은 클래스를 만들고
 * 인스턴스를 생성한 다음 변수를 담아 전달하는 것이 좋다
 * 이때 사용하는 클래스들을 
 * 
 */
public class ScoreVO {
	
	
	//모든 필드 변수를 private으로 선언
	private String num;
	private String name;
	private int inKor;
	private int inEng;
	private int inMath;
	private int inMusic;
	private int inArt;
	private int inSci;
	
	
	private int inSum;
	private int inAvg;
	
	
	
	
	public int getInMusic() {
		return inMusic;
	}
	public void setInMusic(int inMusic) {
		this.inMusic = inMusic;
	}
	public int getInArt() {
		return inArt;
	}
	public void setInArt(int inArt) {
		this.inArt = inArt;
	}
	public int getInSci() {
		return inSci;
	}
	public void setInSci(int inSci) {
		this.inSci = inSci;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getInKor() {
		return inKor;
	}
	public void setInKor(int inKor) {
		this.inKor = inKor;
	}
	public int getInEng() {
		return inEng;
	}
	public void setInEng(int inEng) {
		this.inEng = inEng;
	}
	public int getInMath() {
		return inMath;
	}
	public void setInMath(int inMath) {
		this.inMath = inMath;
	}
	public int getInSum() {
		return inSum;
	}
	public void setInSum(int inSum) {
		this.inSum = inSum;
	}
	public int getInAvg() {
		return inAvg;
	}
	public void setInAvg(int inAvg) {
		this.inAvg = inAvg;
	}
	
	
	
	
	
	
	
	
	
	
	
}
