package com.biz.word.exec;

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

public class WordEx_01 {
	public static void main(String[] args) {
		String wordFile = "src/com/biz/word/exec/word.txt";
		List<WordVO> wordList = new ArrayList<WordVO>();
		
		
		//파일을 open
		FileReader fileReader = null;
		
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(wordFile);
			buffer = new BufferedReader(fileReader);
			
			//로 부터 한줄씩 데이터를 읽어온다
			//이때 데이터의 라인수가 몇개인지 알수 없으므로
			//반복문으로 무한반복 실행하여
			//계속 한줄씩 
			String reader = "";
			while (true) {
				
				reader = buffer.readLine();
				
				if(reader==null) {
					break;
				}
				
				//읽어들은 데이터를 콜론을 기준으로
				//문자열 분해를 하여 words배열에 담아달라
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
		
		Random rnd = new Random();
		int size = wordList.size();
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		int game = 0;
		
		while (true) {
			int index = rnd.nextInt(size); // 0~(wordList 개수 -1) 중의 한수
			System.out.println("다음에 해당하는 영어단어는?(END:종료)");
			System.out.print(wordList.get(index).getKor() + ">>");
			String strEng = scan.nextLine();
			
			if(strEng.equals("END")) {
				break;
			}
			
			if(strEng.equalsIgnoreCase(wordList.get(index).getEng())) {
				System.out.println("맞았습니다 축하합니다!!");
				count ++;
			} else {
				System.out.println("아쉽네요!!!");
				System.out.println(wordList.get(index).getEng());
			} 
			
		}
		System.out.println("GAMW OVER!!");
		System.out.printf("%d 게임중 %d 번 정답 맞춤!!",game,count);
		
	}

}
