package com.biz.exec;

import com.biz.model.AddressVO;

public class Ex_01 {
	
	//^F11를 사용해서 프로젝트를 run하려면 main() method
	public static void main(String[] args) {
		
		AddressVO address1=new AddressVO();
		AddressVO address2=new AddressVO();
		AddressVO address3=new AddressVO();

		address1.setName("홍길동");
		address2.setName("이몽룡");
		address3.setName("성춘양");
		
		address1.setAddr("광주광역시");
		address2.setAddr("인천광역시");
		address3.setAddr("부산광역시");
		
		address1.setTel("010-1111-0000");
		address2.setTel("010-2222-0000");
		address3.setTel("010-3333-0000");
		
		address1.setAge(30);
		address2.setAge(25);
		address3.setAge(19);
		
		//인스턴스에 저장된 주소들을
		//별도의 문자열 변수에 복사하여 Console에 출력
		String addr1=address1.getAddr();
		String addr2=address2.getAddr();
		String addr3=address3.getAddr();
		System.out.println(addr1);
		System.out.println(addr2);
		System.out.println(addr3);
		
		//직접 get method가 return 한 값을 Console에 출력
		System.out.println(address1.getAddr());
		System.out.println(address2.getAddr());
		System.out.println(address3.getAddr());
		
		
	}

}
