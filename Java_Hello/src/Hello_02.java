
public class Hello_02 {

	public static void main(String[] args) {
		//main 시작점 코드
		
		System.out.println(30 + 40 - 10);
		System.out.println(30 * 40 - 10);
		System.out.println(30 - 10 * 40);
		System.out.println( (30 - 10) * 40);
		
		// 이 코드는 문자열 리터럴 과 숫자 덧샘연산을 연결하는
		// 형식의 코드로 번역이 되어 아래의 코드와 같은 형태가 되어버린다
		// 30+40=70이라는 결과가 나올것이라는 생각이었는데
		// 의도와 다른 결과가 나온다
		System.out.println( "30 + 40 = " + 30 + 40);
		System.out.println( "30 + 40 = " + "30" + "40");
		
		// 결국 코드 번역기와 개발자간의 의사소통에 문자가 발생한 것이다
		// 코드 번역기는 원래 그러한 방법으로 번역하도록 만들어저 있기 때문에
		// 어쩔수 없는 결과이다
		// 개발자가 원하는 결과를 바란다면 코드를 세부적으로 수정해야한다
		// 즉, 연산순위를 강제로 변경해 주면된다
		
		System.out.println( "30 + 40 = " + (30 + 40) );
		
	}

}
