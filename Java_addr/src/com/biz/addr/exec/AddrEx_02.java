package com.biz.addr.exec;

import com.biz.addr.service.AddrService02;

public class AddrEx_02 {
	public static void main(String[] args) {
		
		AddrService02 addrService = new AddrService02();
		
		// in 를
		for (int i = 0; i < 5; i++) {
			System.out.println("=====================================");
			System.out.println(i +"번째 주소록");
			System.out.println("-------------------------------------");
			addrService.inputAddr();
		}
	}
}
