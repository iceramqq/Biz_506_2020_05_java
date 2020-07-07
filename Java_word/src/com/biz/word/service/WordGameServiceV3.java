package com.biz.word.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.biz.word.domain.WordVO;

public class WordGameServiceV3 extends WordGameServiceImplV2 {

	/*
	 * 와 같은 클래스류를 이라고 한다.
	 * 다수의 데이터르르 담을수 잇느 클래스들이며 들을 담아서 녕산을 수행하는
	 * 목적으로 사용한다.
	 * 
	 * 클래스들은 하는 클래스의 자손들이다
	 */
	
	// List
	// loadGame, playGame, gameOver 상속받는다
	
	//

	@Override
	public void playGame() {
		Scanner scan = new Scanner(System.in);
		
		count = 0;
		game = 0;
		while (true) {
			
			// shuffle을 사용하여 wordList를 뒤섞고 그중 0번째 위치의 값을 추출한다.
			Collections.shuffle(wordList);
			WordVO wordVO = wordList.get(0);
			
			String[] words = wordVO.getEng().split(":");
			List<String> wordList = Arrays.asList(words);
			Collections.shuffle(wordList);
			
			System.out.println("다음 알파벳을 단어 순서에 맞게 나열하시오(END:종료)");
			System.out.println(wordList);
			String strInput = scan.nextLine();
			if(strInput.equals("END")) {
				break;
			}
			game ++;
			if(wordVO.getEng().equals(words)) {
				System.out.println("맞았습니다 축하합니다!!");
				count ++;
			} else {
				System.out.println("아쉽네요!!!");
				System.out.println("정답은 >>"+wordVO.getEng());
			}
			
			
			
		}
		
		
		
		
	}
	
}
