package com.biz.test;

/*
 * java에서는 모든 기본파일을 클래스라고 한다.
 * java에서 코딩을 시작하면 제일먼저 클래스를 생성하고
 * 클랴스에 진입접 mwthid를 생성하여야 코드를 시랳ㅇ해볼수 잇게 된다.
 * 클래스만 작성된 상태에서 진입 method가 없을면 스스로 아무런 코드도 
 */
public class MemberEx {

	/*
	 * 진입점 method는 클래스를 컴파일하고 run 했을때 java의 가상머신이
	 * 제일먼저 호출하는 method이고 그 문법이 ㅇ정해져 있다.
	 * 
	 * args 배열은 현재 클래스를 cmd 창에서 실행할때 java MemberEx 문자열 형식으로 면령을 입력하면 클래스 뒤에 따라오는
	 * 문자열이 args변수에
	 */
	public static void main(String[] args) {
		// System.out.println(args[0]);
		System.out.println("여기는 클래스 진입점 method 입니다.");

		int num1 = 20;
		int num2 = 30;
		int sum = num1 + num2;
		System.out.println(sum);
		/*
		 * 변수를 선언만한 상태에서 변수를 읽으려고 시도를 하면
		 * 문법오류가 나타난다.
		 * 선ㅇ너만한 상태의 변수는 어떤 값이 저장되어잇는지 알수 없는 상태이다
		 * 이 상태에서 값을 읽는 동작을 수행하게 됨년
		 * 시스템메모리에 저장된 값이 노출되는 현상이 발생을 한ㅁ다
		 * 그래서 자바에서 초기화되지 않은 변수에 담긴 값은 확인할수 없도록
		 * 언어문ㅁ법구조가 형성되어 있다.
		 */
		int num3 = 0;
		System.out.println(num3);
		
		String str =null;
		System.out.println(str);
		/*
		 *  변수를
		 */
		
	}
}
