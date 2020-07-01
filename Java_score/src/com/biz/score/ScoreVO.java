package com.biz.score;

public class ScoreVO {
	
	private String strNum = "";
	private int intko = 0;
	private int intEn = 0;
	private int intMath = 0;
	private int intSum = 0;
	private int intAvg = 0;
	
	
	
	public ScoreVO(String strNum, int intko, int intEn, int intMath, int intSum, int intAvg) {
		this.strNum = strNum;
		this.intko = intko;
		this.intEn = intEn;
		this.intMath = intMath;
		this.intSum = intSum;
		this.intAvg = intAvg;
	}
	
	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public int getIntko() {
		return intko;
	}
	public void setIntko(int intko) {
		this.intko = intko;
	}
	public int getIntEn() {
		return intEn;
	}
	public void setIntEn(int intEn) {
		this.intEn = intEn;
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
	public int getIntAvg() {
		return intAvg;
	}
	public void setIntAvg(int intAvg) {
		this.intAvg = intAvg;
	}
	
	
}
