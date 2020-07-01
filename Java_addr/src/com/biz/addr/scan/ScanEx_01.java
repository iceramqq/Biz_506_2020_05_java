package com.biz.addr.scan;

import java.io.InputStream;
import java.util.Scanner;

/*
 * 화면에 메뉴를 보여주고
 * 키보드로 선택을 하면 해당하는 코드를 실행
 */
public class ScanEx_01 {
	
	public static void main(String[] args) {
		
		// Console에 어떤 값을 출력
		System.out.println();
		

		// 키보드로 부터 전송되어온 이진수를
		// 컴퓨터에서 알아볼수맀는 데잍ㅌ터코드로 변환

		// 키보드로 문자열을 입력하는 동안 그 데이터 코드를
		// 임의로 저장장치에 저장을 하고 있다가
		// 를 누르는 순간 에세 입력이 완료
		
		InputStream in = System.in;
		
		// Console에서 값을 입력
		Scanner scan = new Scanner(in);
		
		//입력을 기다리면서 코드가 잠시 wait상태가 되는 현상을 blocking 되었다 라고 한다
		scan.nextLine();
		
		
		
	}
}
