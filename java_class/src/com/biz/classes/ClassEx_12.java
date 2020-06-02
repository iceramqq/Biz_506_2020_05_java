package com.biz.classes;

import com.biz.classes.model.BankVO;
import com.biz.classes.service.BankServiceV2;

public class ClassEx_12 {
	
	public static void main(String[] args) {
		
		BankVO[] bankList=new BankVO[5];
		/*
		bankList[0]=new BankVO();
		bankList[1]=new BankVO();
		bankList[2]=new BankVO();
		bankList[3]=new BankVO();
		bankList[4]=new BankVO();
				
		for(int i=0;i<5;i++) {
			bankList[i].setStrNum("001");
		}
		
		bankList[0].setStrDate("2020-05-01");
		bankList[1].setStrDate("2020-05-02");
		bankList[2].setStrDate("2020-05-03");
		bankList[3].setStrDate("2020-05-04");
		bankList[4].setStrDate("2020-05-05");
		
		*/
		
		for(int i=0;i<5;i++) {
			bankList[i]=new BankVO();
			bankList[i].setStrNum("001");
			String strName="2020-05-0"+(i+1);
			bankList[i].setStrDate(strName);
		}
		
		bankList[0].setIntInput(5000);
		bankList[2].setIntInput(5000);
		
		bankList[1].setIntOutput(1000);
		bankList[3].setIntOutput(1000);
		bankList[4].setIntOutput(1000);
		
		//기본형 변수
		//primitive variable
		int num=0;//integer
		long num1=0L;
		float num2=0.0f;
		double num3=0.0;
		boolean bYes=false;
		char char1='c';
		
		//String(문자열)형 변수는
		//변수처럼 사용하지만 실제로는
		//일반변수와 달리
		//String클래스로 만든 String형 인스턴스라고 해야 한다
		String strName="홍길동";
		//String strName=new String("홍길동");
		
		//String strName=new String();
		
		//BankServiceV2클래스를 사용해서
		//bankService라는 변수를 선언
		//bankService변수를 "객체", 인스턴스
		//라고한다
		BankServiceV2 bankService = new BankServiceV2();
		//bankService인스턴스를 통해서
		//bankService() 메서드를 호출하면
		//BankServiceV2 클래스내에 정의된
		//bankList() 
		bankService.bankList();
		
		bankService.bankList(bankList);
		
		
		
		
	}

}
