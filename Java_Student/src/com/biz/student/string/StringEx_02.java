package com.biz.student.string;

public class StringEx_02 {
	public static void main(String[] args) {
		
		String strNation = "Republic of Korea";
		
		//strNation에 담긴 문자열에서 9<=x<11범위의 문자열을 잘라서 subNation에 담아라
		String subNation = strNation.substring(9,11);
		System.out.println(subNation);
		
		//문자열 개수가 몇개냐?
		int strLength = strNation.length();
		
		for (int i = 0; i < strLength; i++) {
			String s = strNation.substring(i,i+1);
			System.out.println(s);
		}
		
		//문자열
		char[] charNation = strNation.toCharArray();		
		for (int i = 0; i < charNation.length; i++) {
			System.out.print(charNation[i]+"\t");
		}
		System.out.println();
		
		String[] strNations = strNation.split("");
		for (int i = 0; i < strNations.length; i++) {
			System.out.println(strNations[i]+"\t");
		}
		System.out.println();
	}

}
