package com.biz.classes.service;

import javax.swing.text.AbstractDocument.BranchElement;

import com.biz.classes.model.BankVO;

/*
 * main() 메서드가 없는 클래스는 직접run할수 없다
 * 가 있는 코드에서
 * 클래스를 인스턴스로 선언하고 인스턴스를 통해서
 */
public class BankServiceV2 {

	/*
	 * 메서드 어떤 코드들의 묶음을 만들어 두고 사용할때, 두줄의 명령문만으로 기능을
	 */
	public void bankList() {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");

	}

	/*
	 * 클래스로 생성한 인스턴스에 담긴 데이터들을
	 * 매개변수를 받아서
	 * 무언가 처리하는 메서드
	 */
	public void bankList(BankVO bankVO) {

	}

	/*
	 * 클래스로 생성한 인스턴스 "배열에" 담긴 데이터들을
	 * 매개변수를 받아서
	 * 무언가 처리하는 메서드
	 */
	public void bankList(BankVO[] bankList) {
		System.out.printf("계좌번호\t날짜\t입금\t출금\t잔액\n");
		
		//bankList
		//반복문을 실행하라
		int sum = 0;
		for (int i = 0; i < bankList.length; i++) {
			sum += bankList[i].getIntInput();
			sum -= bankList[i].getIntOutput();
			System.out.printf("%s\t%s\t%d\t%d\t%d\n",
					bankList[i].getStrNum(),
					bankList[i].getStrDate(),
					bankList[i].getIntInput(),
					bankList[i].getIntOutput(),
					sum);
					
		}
	}

}
