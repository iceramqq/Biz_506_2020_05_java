package com.biz.classes;

import com.biz.classes.model.Address;

public class ClassEx_04 {
	
	public static void main(String[] args) {
		
		//city변수는 private이기 때문에
		//인스턴스를 통해서 직접 접근 불가
		//address.city = "광주광역시"
		
		//city 변수에 값을 저장하기위한
		//seter method()에게 값을
		//저장해 달라고 요청
		Address address =new Address();
		address.setCity("광주광역시");
		
		
		String city=address.getCity();
		address.setCity("서울특별시");
		System.out.println(city);
		
				
	}

}
