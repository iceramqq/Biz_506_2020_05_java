package com.biz.hello;

public class varstring_03 {
	public static void main(String[] args) {
		int num1=30;
     	String str1="나이";
     	
     	
     	//문자열형 변수에 담긴str1 문자열 리터럴과
     	//정수형 num1에 담긴 숫ㅈ바값 30을
     	//플러스 연산하여
     	//문자열형 함수sum에 저장
     	//sum저장된 문자열형 리터럴 콘솔에 보여라
     	String sum=str1+num1;
        sum=num1+str1;
     	System.out.println(sum);
		/*
		 * 무나자열형 +문자열 이외의 형의 연산을 수행하면
		 * 문자열 이외도 문자열로 변환
		 * 문자열형 연산 수행
		 */
     	
     	float num2=30.2f;
     	
     	
     	//문자열형+실수=문자열형+문자열형 변환
     	//문자열형 변수 sum에 활당
     	sum=num2+str1;
     	System.out.println(sum);
     	
     	System.out.println(3+"+"); //"3"+"+"
     	System.out.println(3+"+"+5+"="+3+5);
     	System.out.println(3+"+"+5+"="+(3+5));
     	
     	
     	
     	
     	
	}
	

}
