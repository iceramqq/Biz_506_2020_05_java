package com.biz.addr.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.addr.domain.AddrVO;

public class AddrService02 {
	
	private List<AddrVO> addrList;
	
	// 신중하게 사용하는 것이 좋다.
	// 클래스의 경우는 가급적 필드영역에서 직접 초기화 하지 말고
	// 생성자 에서 초기화를 시키는 것이 좋다.
	// 필드영역에서 초기화된 객체들도 
	private Scanner scan;
	
	//
	public AddrService02() {
		addrList = new ArrayList<AddrVO>();
		scan = new Scanner(System.in);
	}
	
	// 키보드를 통해서 주소를 입력받고
	public void inputAddr() {
		
		System.out.print("이름 >> ");
		String strName = scan.nextLine();
		
		System.out.print("전화번호 >> ");
		String strTel = scan.nextLine();

		System.out.print("주소 >> ");
		String strAddr = scan.nextLine();

		System.out.print("나이 >> ");
		String strAge = scan.nextLine();
		
		int intAge = 0;
		try {
			intAge = Integer.valueOf(strAge);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("나이는 숫자만 가능합니다");
			System.out.println("나이 입력이 잘못되어 0으로 임시 저장합니다");
		}
		
		System.out.print("관계 >> ");
		String strNet = scan.nextLine();

		AddrVO addrVO = new AddrVO();
		addrVO.setName(strName);
		addrVO.setTel(strTel);
		addrVO.setAddr(strAddr);
		addrVO.setAge(intAge);
		addrVO.setNet(strNet);
		
		addrList.add(addrVO);
		
	}
	
}
