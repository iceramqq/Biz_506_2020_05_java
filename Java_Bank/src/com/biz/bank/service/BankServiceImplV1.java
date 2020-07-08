package com.biz.bank.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.bank.domain.AccountVO;

public class BankServiceImplV1 implements BankService {
	
	protected List<AccountVO> bankList;
	protected Scanner scan;
	protected String num;
	protected int intBalance;
	
	public BankServiceImplV1() {
		// TODO Auto-generated constructor stub
		bankList = new ArrayList<AccountVO>();
		scan = new Scanner(System.in);
		num = "001-001";
		intBalance = 100000;
	}

	@Override
	public boolean inputBalance() {
		// TODO Auto-generated method stub
		AccountVO accVO = new AccountVO();
		System.out.print("입금 >>");
		String strInput = scan.nextLine();
		int	intInput = 0;
		try {
			intInput = Integer.valueOf(strInput);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("숫자만 입력가능!!");
		}
		accVO.setInput(intInput);		
		
		System.out.print("날짜 >>");
		String strDate = scan.nextLine();
		accVO.setDate(strDate);
		
		bankList.add(accVO);
		
		return true;
		
	}

	@Override
	public boolean outputBalance() {
		// TODO Auto-generated method stub
		AccountVO accVO = new AccountVO();
		
		System.out.print("출금 >>");
		String strOutput = scan.nextLine();
		int intOutput = 0;
		try {
			intOutput = Integer.valueOf(strOutput);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("숫자만 입력가능!!");
		}
		if(intBalance < intOutput) {
			System.out.println("잔액이 부족합니다...");
		} else {
			accVO.setOutput(intOutput);
			
			System.out.print("날짜 >>");
			String strDate = scan.nextLine();
			accVO.setDate(strDate);
		}
		
		
		bankList.add(accVO);
		
		return true;
	}

	@Override
	public void listBalance() {
		
		System.out.println("==============================================");
		System.out.println("입출금내역");
		System.out.println("==============================================");
		System.out.println("계좌번호\t날짜\t입금\t출금\t잔액");
		System.out.println("----------------------------------------------");
		for (AccountVO accVO : bankList) {
			System.out.print(num+"\t");
			System.out.print(accVO.getDate()+"\t");
			System.out.print(accVO.getInput()+"\t");
			System.out.print(accVO.getOutput()+"\t");
			
			intBalance += accVO.getInput();
			intBalance -= accVO.getOutput();
			System.out.print(intBalance+"\n");
		}
		
	}
	

}
