package com.biz.student.exec;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.student.donain.ScoreVO;

public class ScoreEx_04 {
	public static void main(String[] args) {
		
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		String scoreFile = "src/com/biz/student/exec/Score.csv";
		
		// file과 관련된 클래스는 객체로 선언하는 코드와
		// 
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(scoreFile);
			buffer = new BufferedReader(fileReader);
			
			//파일을 읽기 전에 파일 한줄의 문자열을 읽어 담을 문자열 변수를 선언한다,
			//
			String reader = "";
			while (true) {
				reader = buffer.readLine();
				if(reader == null) {
					break;
				}
				
				String[] scores = reader.split(":");
				ScoreVO sVO = new ScoreVO();
				sVO.setNum(scores[0]);
				sVO.setKor(Integer.valueOf(scores[1]));
				sVO.setEng(Integer.valueOf(scores[2]));
				sVO.setMath(Integer.valueOf(scores[3]));
				scoreList.add(sVO);
			}
			buffer.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(scoreFile + "파일을 읽기 위해 오픈 중 오류발생!!");
		} catch(NumberFormatException e) {
			System.err.println("점수를 숫자로 바꾸는 과정에서 오류 발생!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("버퍼로 부터 데이터를 읽는데 문제가 발생!!");
		} //try : 파일 읽기 end
		
		int size = scoreList.size();
		for (int i = 0; i < size; i++) {
			ScoreVO sVO = scoreList.get(i);
			if(sVO.getNum().equals(00010)) {
				System.out.println("학번:"+sVO.getNum());
				System.out.println("국어:"+sVO.getKor());
				System.out.println("영어:"+sVO.getEng());
				System.out.println("수학:"+sVO.getMath());
				break;
			}
		}
		
		for (ScoreVO sVO : scoreList) {
			if(sVO.getNum().equals(00010)) {
				System.out.println("학번:"+sVO.getNum());
				System.out.println("국어:"+sVO.getKor());
				System.out.println("영어:"+sVO.getEng());
				System.out.println("수학:"+sVO.getMath());
				break;
			}
		}
		
		
	}

}
