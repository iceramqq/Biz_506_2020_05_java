package com.biz.student.exec;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Random;

/*
 * 학번, 국어, 영어, 수락, 총점, 평균 데이터를 생성하여
 * 엑셀에서 열어서 사용할 수 있도록 파일을 작성
 * 엑셀은 파일 외에 *.csv라는 파일을 읽어서
 * 엑셀 데이터처럼 취급할수 있는데
 * 
 * *.csv 파일은 
 * 컴마로 데이터들을 구문하는 문자열로 만들고 
 * 그 내용을 형식으로 저장하면 된다.
 */
public class ScoreEx_03 {
	public static void main(String[] args) {
		
		PrintWriter output = null; //System.out;
		String outFile = "src/com/biz/student/exec/Score.csv";
		
		// 지금부터 변수에 저장된 파일이름으로
		// 를 기록하기 위해 파일을 만들어라
		try {
			output = new PrintWriter(outFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Random rnd = new Random();
		
		for (int i = 0; i < 30; i++) {
			
			int intKor = rnd.nextInt(50)+51;
			int intEng = rnd.nextInt(50)+51;
			int intMath = rnd.nextInt(50)+51;
			
			int intSum = intKor+intEng+intMath;
			float floatAvg = (float)intSum / 3;
			
			String score = String.format("%05d:%d:%d:%d:%d:%06.2f",
					i+1,intKor,intEng,intMath,intSum,floatAvg);
			output.println(score);
			
		}
		output.close();
		System.out.println("완료!!!");
	}

}
