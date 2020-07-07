package com.biz.student.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.student.donain.ScoreVO;
import com.biz.student.donain.StudentVO;

public class ScoreServiceImplV1 implements ScoreService {
	
	protected List<StudentVO> studentList;
	protected List<ScoreVO> scoreList;
	
	public ScoreServiceImplV1() {
		// TODO Auto-generated constructor stub
		studentList = new ArrayList<StudentVO>();
		scoreList = new ArrayList<ScoreVO>();
	}
	
	@Override
	public void inputStudent() {
		// TODO Auto-generated method stub
		String studentFile = "src/com/biz/student/exec/student.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(studentFile);
			buffer = new BufferedReader(fileReader);
			
			String reader = "";
			while (true) {
				reader = buffer.readLine();
				if(reader == null) {
					break;
				}
				
				String[] students = reader.split(":");
				StudentVO sVO = new StudentVO();
				sVO.setNum(students[0]);
				sVO.setName(students[1]);
				studentList.add(sVO);
			}
			buffer.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(studentFile + "파일을 읽기 위해 오픈 중 오류발생!!");
		} catch(NumberFormatException e) {
			System.err.println("점수를 숫자로 바꾸는 과정에서 오류 발생!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("버퍼로 부터 데이터를 읽는데 문제가 발생!!");
		} 
		 
		
	}

	@Override
	public void inputScore() {
		String scoreFile = "src/com/biz/student/exec/Score.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(scoreFile);
			buffer = new BufferedReader(fileReader);
			
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
				sVO.setSum(Integer.valueOf(scores[4]));
				sVO.setAvg(Float.valueOf((scores[5])));
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
		}
		
	}

	@Override
	public void calcSum() {
		// TODO Auto-generated method stub
		for (ScoreVO scoreVO : scoreList) {
			int sum =scoreVO.getKor()
					+scoreVO.getEng()
					+scoreVO.getMath();
			scoreVO.setSum(sum);
		}
		
	}

	@Override
	public void calcAvg() {
		// TODO Auto-generated method stub
		for (ScoreVO scoreVO : scoreList) {
			float avg = (float)scoreVO.getSum()/3;
			scoreVO.setAvg(avg);
		}
		
	}

	@Override
	public void scoreList() {
		// TODO Auto-generated method stub
		System.out.println("==============================================================================");
		System.out.println("성적일람표");
		System.out.println("==============================================================================");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------------------------------------------------");
		
		// data의 조인
		// scoreList, studentaList Join해서
		for (ScoreVO scVO : scoreList) {
			System.out.print(scVO.getNum()+"\t");
			
			// 이름
			// score의 학번으로 studentList에서 찾기
			for (StudentVO stVO : studentList) {
				// 학번이 같은 학생의 정보를 찾았으면
				if(scVO.getNum().equals(stVO.getNum())) {
					System.out.print(stVO.getName()+"\t");
					break;
				}
			}
			System.out.print(scVO.getKor()+"\t");
			System.out.print(scVO.getEng()+"\t");
			System.out.print(scVO.getMath()+"\t");
			System.out.print(scVO.getSum()+"\t");
			System.out.printf("5.2f\n",scVO.getAvg());
		}
		System.out.println("==============================================================================");	
	}

}
