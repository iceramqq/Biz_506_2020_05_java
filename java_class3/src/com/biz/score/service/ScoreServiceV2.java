package com.biz.score.service;

import com.biz.score.vo.ScoreVO;

/*
 * scores 인스턴스배열을 필드변수로 선언한 이유
 * Ex클래스에서 service클래스에서
 * 총점계산, 평균계산, 리스트 출력을 요청할텐데
 * 요청을 할때마다
 * 
 *  Ex클래스에서 요청들을 할때마다 score배열을맥변수로
 *  전달을 하면
 *  
 */
public class ScoreServiceV2 {
	
	LineService line=new LineService();
	private ScoreVO[] scores;
	
		
	/*
	 * 필ㄷ변수로 scores 선언되어 있기 때문에
	 * 학생 총점과 평균을 계산한 후
	 * 어디에 저장해야 할지를 고민하지 않아도 된다.
	 */
	public void scoreSum(ScoreVO[] scores) {
		
		this.scores=scores;
		
		for(int i=0;i<scores.length;i++) {
			scores[i].setSum(
					scores[i].getKor()
					+scores[i].getEng()
					+scores[i].getMath()
					+scores[i].getMusic()
					);
		}
	}
	
	public void scoreAvg() {
		for(int i=0;i<scores.length;i++) {
			scores[i].setAvg(scores[i].getSum()/4);
		}
	}
	public void scoreList() {
		int num=60;
		System.out.println(line.do_line(num));
		System.out.println("성적리스트");
		System.out.println(line.do_line(num));
		System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");
		System.out.println(line.single(num));
		
		//점수리스트를 표시할때는 for반복문을 이용해서 사용
		//this.현재 이 클래스에서 선언된 이라는 뜻
		int sumKor=0;
		int sumEng=0;
		int sumMath=0;
		int sumMusic=0;
		int sumAll=0;
		for(int i=0;i<scores.length;i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%d\n"
					,scores[i].getNum()//string
					,scores[i].getKor()//int
					,scores[i].getEng()//int
					,scores[i].getMath()//int
					,scores[i].getMusic()//int
					,scores[i].getSum()//int
					,scores[i].getAvg()//int
					);
			sumKor+=scores[i].getKor();
			sumEng+=scores[i].getEng();
			sumMath+=scores[i].getMath();
			sumMusic+=scores[i].getMusic();
			sumAll+=scores[i].getSum();
		}
		System.out.println(line.single(num));
		System.out.printf("총점\t%d\t%d\t%d\t%d\t%d\t%d\n"
				,sumKor
				,sumEng
		        ,sumMath
		        ,sumMusic
		        ,sumAll
		        ,0
				);
		
		int avgkor=sumKor/scores.length;
		int avgEng=sumEng/scores.length;
		int avgmath=sumMath/scores.length;
		int avgMusic=sumMusic/scores.length;
		int avgAvg=(avgkor+avgEng+avgmath+avgmath+avgMusic)/4;
		System.out.printf("평균\t%d\t%d\t%d\t%d\t%d\t%d\n"
				,avgkor
				,avgEng
		        ,avgmath
		        ,avgMusic
		        ,0
		        ,avgAvg
				);
		System.out.println(line.do_line(num));
	}

}
