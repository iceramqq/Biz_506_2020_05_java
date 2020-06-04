package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_01 {

	public static void main(String[] args) {
				
		List<Integer> intList = new ArrayList<Integer>();
		Random rnd = new Random();
		for (int i = 0; i < 100; i++) {
			intList.add(rnd.nextInt());
		}
		int intSum = 0;
		for (int i = 0; i < 100; i++) {
			intSum += intList.get(i);
		}
		System.out.println(intSum);

	}

}
