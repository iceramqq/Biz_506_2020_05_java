package com.biz.addr.exec;

public class NewEX_01 {
	public static void main(String[] args) {
		
		// 클래스에는 기본생성자를 임의로 만들지 않아
		NewClass_01 nc = new NewClass_01();
		
		// 클래스에는
		// 값을 매개변수로 주입받아야 하는
		// 필드 생성자를 임의로 작성해 두었다.
		// 필드 생성자를 임의로 작성을 하게 되면
		// 클래스의 기본생성자는 삭제된다.
		
		// NewClass_02 nc2 = new NewClass_02();
		
	}
}
