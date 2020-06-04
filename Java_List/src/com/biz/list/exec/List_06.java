package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_06 {
	
	public static void main(String[] args) {
		
		List<Character> charList=new ArrayList<Character>();
		
		Random rnd=new Random();
		for(int i=0;i<100;i++) {
			char char1=(char)(rnd.nextInt(26)+'A');
			charList.add(char1);
		}
		
		for(int i=0;i<100;i++) {
			char char2=charList.get(i);
			if(char2=='F') {
				System.out.println("문자 중 F가 최초로 나타난 위치는 : "+i);
				break;
			}
		}
		
	}

}
