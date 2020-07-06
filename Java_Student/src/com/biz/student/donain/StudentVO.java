package com.biz.student.donain;

/*
 * 클래스는 실제로 프로젝트에서
 * 주로 다루게될 를 추상화한 클래스
 * 
 */
public class StudentVO {
	private String num = ""; //숫자형으로 하면 000을 부착할수 없다
	private String name = "";
	private int grade = 0;
	private String dept = "";
	
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
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

}
