package com.biz.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) {
		
		String fileName = "data.txt";
		/*
		 * text 파일읽기
		 */
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			/*
			 * 선언된 객체를 생성(초기화)하기
			 * 파일 읽기, 쓰기와 관련괸 클새스들은 반드시 예외처리를 해주어야 한다.
			 * try catch 블럭으로 감싸서 발생할수 있은 exception을 
			 */
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			String reader = new String();
			while (true) {
				/*
				 * 무한반복문에서 text 파일의 랑니을 읽은 후
				 * console에 표ㅗ시하는데 
				 * 이상황에서 만약 text파일을 모두 읽5어 버렸담녀
				 * console에는 null값이 계속 반속해서 출력된다
				 */
				reader = buffer.readLine();
				/*
				 * 
				 */
				if(reader == null) {
					break;
				}
				
				System.out.println(reader);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
