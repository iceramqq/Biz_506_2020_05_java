package com.biz.student.string;

/*
 * 일반변수와 객체의 차이
 * 일반변수 : 그냥데이터를 저장하는 메모리의 저장 공간일 뿐이다
 * 객체 :  
 * 		데이터를 가공, 연산 하는 일들을 수행할 수 있다.
 */
public class StringEx_01 {
	
	public static void main(String[] args) {
		
		String strNation = "republic of Korea";
		
		/*
		 * 은 문자열 변수이면서 
		 */
		
		// 에 담긴 문자열을 모두 대문자로 바꾸어서 리턴하는 메서드
		System.out.println(strNation.toUpperCase());
		System.out.println(strNation.toLowerCase()); // 소문자로 바꾸기
		
		//
		System.out.println(strNation.equals("korea"));
		
		
		strNation = "Korea";
		System.out.println(strNation.equalsIgnoreCase("korea"));
		
		//strNation문자열에 Korea라는 문자열이 들어있냐?
		strNation = "republic of Korea";
		System.out.println(strNation.contains("Korea"));
		
		//문자열 별도로 객체변수에 담지 않아도
		// ""
		System.out.println("Korea".equals("Korea"));
		
		System.out.println("KoRea".toUpperCase());
		
		//문자영을 대문자로
		String str1 = "rePublic of koRea".toUpperCase();
		
	}

}
