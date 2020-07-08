package com.biz.bank.service;

import java.io.File;
import java.io.FileNotFoundException;

/*
 * v3를 상속박음으로 해서
 * 와
 * 메서드를 사용가능
 */
public class bankServiceImplV4 extends BankServiceImplV3 {
	
	private String accNum = "";
	private String basePackage = "";
	
	//사용자로 부터 계좌
	public boolean account() {
		
		basePackage = "src/com/biz/bank/exec/data";
		
		System.out.println("계좌번호 입력(00001 형식)");
		accNum = scan.nextLine();
		try {
			//
			accNum = String.format("BALANCE-%05d.txt", Integer.valueOf(accNum));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("계좌번호는 정수 5자리 이내 값만 가능!!!");
			return false;
		}
		System.out.println("계좌번호:"+accNum);
		
		File file = new File(basePackage, accNum);
		this.bfileName = basePackage+file.separator+accNum;
		this.loadBalance();
		return true;
	}
}
