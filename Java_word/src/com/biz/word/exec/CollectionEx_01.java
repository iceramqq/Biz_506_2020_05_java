package com.biz.word.exec;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionEx_01 {
	
	public static void main(String[] args) {
		
		String nation = "Korea";
		String[] nations = nation.split("");
		
		// Arrays.asList(배열) : 배열을 List 형 데이터로 변환
		List<String> words = Arrays.asList(nations);
		
		//collections 클래스의 기능을 몇가지 사용하기 위해서
		//배열을 List 형 데이터로 변환했다
		
		//사용하는데 아무련 제약이 없이 사용해도 된다.
		Collections.sort(words);
		System.out.println(words);
		
		Collections.shuffle(words);
		System.out.println(words);
		
	}

}
