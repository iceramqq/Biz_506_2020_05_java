package com.biz.addr.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.addr.domain.AddrVO;

public class AddrService01 {
	
	/*
	 * 현재 클래스를 선언하면서 
	 * 라는 필드변수를 선언 만 해 둔 상태
	 * 선언만 된 필드변수 중에 객체형태의 변수는 
	 * 그변수에 값을 저장, 추가하여고 하면 이 발생하면서
	 * 코드가 진행이 되지 않는다.
	 * 
	 * 아래의 1~3의 방법으로 반듯시 변수르르 초기화  해주어야 한다.
	 * 1.
	 * 
	 * 2.
	 * 
	 * 3.
	 * 
	 * 
	 * 객체형태의 변수란 클래스를 사용하여 선언된 변수들
	 * (int, fliat, 등 기본 형태의 변수 이외의 형태로 선언된 변수들)
	 */
	private List<AddrVO> addrList = new ArrayList<AddrVO>(); // 1.필드변수를 선언과 동시에 초기화
	
	// 2. 생성자를 이용하여 필드변수 초기화 하기
	// 클래스의 기본 생성자를 이용하여 
	// 누군가 클래스를 객체로 선언하고
	// 초기화를 하기 위해 생성자를 호출하면
	// 자동으로 필드변수가 초기화 되어
	// 이후의 코드에서
	public AddrService01() {
		this.addrList =new ArrayList<AddrVO>();
	}
	
	/*
	 * 5명의 주소를 생성하여
	 * addrList에 추가
	 */
	public void makeAddr() {
		
		// 3.사용하기 직전에 필드변수를 초기화 하기
		//
		addrList = new ArrayList<AddrVO>();
		
		// 1며의 주소를 저장할 객체
		// 클래스를 사용하여
		//
		AddrVO addrVO = new AddrVO();
		addrVO.setName("홍길동");
		addrVO.setTel("010-111-1111");
		addrVO.setAddr("서울특별시");
		addrVO.setAge(33);
		addrVO.setNet("친구");
		addrList.add(addrVO); // 새로생성한 주소를 주소록
		
		/*
		 * 또한명의 주소를 저장할 VO 객체 만들기
		 * 이미 만들어진 addrVO를 재할용(재 정의)한다
		 * 홍길동 주소를 담은 addrVO를 새롭게 제 정의하여
		 * 저장공간을 비워주는 실행을 한다.
		 */
		addrVO = new AddrVO(); // 이전에 만들어진 객체(인스턴스)를 재활용하기 위해서는 반드시 다시 생성한다.
		addrVO.setName("이몽룡");
		addrVO.setTel("010-222-2222");
		addrVO.setAddr("익산시");
		addrVO.setAge(22);
		addrVO.setNet("후배");
		addrList.add(addrVO);
		
		addrVO = new AddrVO();
		addrVO.setName("성춘양");
		addrVO.setTel("010-333-3333");
		addrVO.setAddr("대전광역시");
		addrVO.setAge(18);
		addrVO.setNet("동생");
		addrList.add(addrVO);
		
		addrVO = new AddrVO();
		addrVO.setName("신가명");
		addrVO.setTel("010-444-4444");
		addrVO.setAddr("부산광역시");
		addrVO.setAge(33);
		addrVO.setNet("친구");
		addrList.add(addrVO);

		addrVO = new AddrVO();
		addrVO.setName("김가명");
		addrVO.setTel("010-555-5555");
		addrVO.setAddr("서울특별시");
		addrVO.setAge(22);
		addrVO.setNet("후배");
		addrList.add(addrVO);
		
		addrVO = new AddrVO("성춘양", "010-333-3333", "남원시", 16, "이몽용 연인");
		addrList.add(addrVO);
		
		addrVO = new AddrVO("성춘양", "010-333-3333", "남원시", 16, "이몽용 연인");
		addrList.add(addrVO);
		
		addrVO = new AddrVO("성춘양", "010-333-3333", "남원시", 16, "이몽용 연인");
		addrList.add(addrVO);
		
		addrVO = new AddrVO("성춘양", "010-333-3333", "남원시", 16, "이몽용 연인");
		addrList.add(addrVO);
		
		addrVO = new AddrVO("성춘양", "010-333-3333", "남원시", 16, "이몽용 연인");
		addrList.add(addrVO);
		
		addrVO = new AddrVO("장보고", "010-444-4444");
		addrList.add(addrVO);
	}
	
	public void addrList() {

		
		System.out.println("============================================");
		System.out.println("주소록");
		System.out.println("--------------------------------------------");
		System.out.println("이름\t전화번호\t주소\t나이\t관계");
		System.out.println("--------------------------------------------");
		
		// 5명의 주소록을 표시할때는 문제가 없으나
		// 만약 주소록 데이터의 개수가 변경되면 문제를 일이킨다
		int addrSize =addrList.size();
		
		for (int i = 0; i < addrSize; i++) {
			AddrVO vo = addrList.get(i); 
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getTel()+"\t");
			System.out.print(vo.getAddr()+"\t");
			System.out.print(vo.getAge()+"\t");
			System.out.print(vo.getNet()+"\n");
		}
		
	}
	
}
