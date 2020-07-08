package com.biz.bank.exec;

import java.util.Scanner;

import com.biz.bank.service.BankService;
import com.biz.bank.service.bankServiceImplV4;

public class BankEx_04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BankService bService = new bankServiceImplV4();
		
		while (true) {
			System.out.println("=========================================");
			System.out.println("빛고을 뱅크 계정계 시스템 V3");
			System.out.println("=========================================");
			System.out.println("1.입금처리");
			System.out.println("2.출금처리");
			System.out.println("3.입출금 내역 출력");
			System.out.println("-1.업무종료");
			System.out.println("=========================================");
			System.out.print("업무선택 >>");
			
			String strMenu = scan.nextLine();
			int intMenu = 0;
			try {
				intMenu=Integer.valueOf(strMenu);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("메뉴선택은 숫자로만 입력하세요");
				continue;
			}
			if(intMenu == -1) {
				break;
			} else if (intMenu < 1 || intMenu > 3) {
				System.out.println("선택된 업무가 없습니다");
				continue;
			} 
			
			/*
			 * 를 설계할 당시 필요하지 않아 정의하지 얺은 메서드는ㅁ
			 * 보통 구현딘 클래스내에서만 사용하는 것으로
			 * 
			 * 그러나, 프로젝트가 진행되는 동안 
			 * 
			 * 객체를 선언할때 로 선언을 하면 
			 * 
			 */
			boolean bRet = ((bankServiceImplV4)bService).account();
			if(!bRet) {
				continue;
			}
			
			if (intMenu == 1) {
				bService.inputBalance();
			} else if (intMenu == 2) {
				bService.outputBalance();
			} else if (intMenu == 3) {
				bService.listBalance();
			} 
			
		}
		
	}
}
