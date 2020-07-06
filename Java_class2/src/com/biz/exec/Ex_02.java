package com.biz.exec;

import com.biz.model.AddressVO;
import com.biz.service.AddressServiceV1;

public class Ex_02 {
	public static void main(String[] args) {

		AddressVO[] address = new AddressVO[5];

		for (int i = 0; i < address.length; i++) {
			address[i] = new AddressVO();
		}
		
		address[0].setName("홍길동");
		address[1].setName("이몽룡");
		address[2].setName("성춘양");
		address[3].setName("김기준");
		address[4].setName("이영성");
		
		address[0].setAddr("서울특별시");
		address[1].setAddr("인천광역시");
		address[2].setAddr("광주광역시");
		address[3].setAddr("대구광역시");
		address[4].setAddr("부산광역시");
		
		address[0].setTel("010-111-0000");
		address[1].setTel("010-222-0000");
		address[2].setTel("010-333-0000");
		address[3].setTel("010-444-0000");
		address[4].setTel("010-555-0000");
		
		address[0].setAge(30);
		address[1].setAge(22);
		address[2].setAge(26);
		address[3].setAge(29);
		address[4].setAge(18);
		
		AddressServiceV1 addressService=new AddressServiceV1();
		//배열을 매개변수를 통해 메서드에게 전달
		addressService.addrList(address);
		
	}

}
