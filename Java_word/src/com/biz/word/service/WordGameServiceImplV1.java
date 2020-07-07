package com.biz.word.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.biz.word.domain.SplitPosition;
import com.biz.word.domain.WordVO;

public class WordGameServiceImplV1 implements WordGameService {
	
	protected List<WordVO> wordList;
	protected int count = 0;
	protected int game = 0;
	
	public WordGameServiceImplV1() {
		// TODO Auto-generated constructor stub
		wordList = new ArrayList<WordVO>();
		
	}
	@Override
	public void loadWord() {
		// TODO Auto-generated method stub
		String wordFile = "src/com/biz/word/exec/word.txt";
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(wordFile);
			buffer = new BufferedReader(fileReader);
			
			String reader = "";
			while (true) {
				
				reader = buffer.readLine();
				
				if(reader==null) {
					break;
				}
				
				String[] words = reader.split(":");
				WordVO wVO = new WordVO();
				wVO.setEng(words[SplitPosition.WORD_ENG]); // words[0]
				wVO.setKor(words[SplitPosition.WORD_KOR]); // words[1]
				
				wordList.add(wVO);
			}
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int size = wordList.size();
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			int index = rnd.nextInt(size); // 0~(wordList 개수 -1) 중의 한 수
			System.out.println("========================================================");
			System.out.println("다음에 해당하는 영어단어는?(END:종료)");
			System.out.print(wordList.get(index).getKor() + " >>");
			String strEng = scan.nextLine();
			
			if(strEng.equals("END")) {
				break;
			}
			game ++;
			
			if(strEng.equalsIgnoreCase(wordList.get(index).getEng())) {
				System.out.println("맞았습니다 축하합니다!!");
				count ++;
			} else {
				System.out.println("아쉽네요!!!");
				System.out.println("정답은 >>"+wordList.get(index).getEng());
			}
		}
		
	
	}

	@Override
	public void gameOver() {
		// TODO Auto-generated method stub
		System.out.println("========================================================");
		System.out.println("GAME OVER!!");
		System.out.printf("%d 게임중 %d 번 정답 맞춤!!",game,count);
	}
	
}
