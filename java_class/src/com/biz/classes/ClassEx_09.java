package com.biz.classes;

import com.biz.classes.service.LineService;
import com.biz.classes.service.ScoreService;

public class ClassEx_09 {
	public static void main(String[] args) {
		int intKor=90;
		int intEng=80;
		int intMath=78;
		
		LineService Line= new LineService();
		ScoreService score=new ScoreService();
		
		String d_Line=Line.do_Line(30);
		String s_Line=Line.single(30);
		
		System.out.println(d_Line);
		System.out.println("성적일람표");
		System.out.println(s_Line);
		System.out.println("국어\t영어\t수학\t총점");
		System.out.println(s_Line);
		System.out.printf("%d\t%d\t%d\t%d\n",intKor,intEng,intMath,score.sum(intKor,intEng,intMath));
		System.out.println(d_Line);
		
		
		
	}

}
