package com.biz.classes.service;

import com.biz.classes.model.BankVO;

public class BankService {

	public void bankList(BankVO[] bankList) {
		
		LineService lineService = new LineService();
		String d_line = lineService.do_line(50);
		String s_line = lineService.single(50);
		
		System.out.println(d_line);
		System.out.println("계좌입출금내역");
		System.out.println(s_line);
		System.out.println("계좌번호\t날짜\t입금\t출금\t잔액");

		for(int i = 0 ; i < bankList.length ; i++) {
			
			System.out.printf("%s\t%s\t%d\t%d\n",
					bankList[i].getStrNum(),
					bankList[i].getStrDate(),
					bankList[i].getIntInput(),
					bankList[i].getIntOutput()
					);
		}
		System.out.println(d_line);
	}
	
}
