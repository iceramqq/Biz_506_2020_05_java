package com.biz.hello;

public class var_11 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=100;i++) {
			
			//3의 배수이면서 6의 배수이면
			//&&:and
			//||:or
			if(i%3==0&&i%6==0) {
				sum=i;
			}
		}
		System.out.println("3의 배수이면서 6의배수들의 합:"+sum);
	}

}
