package com.biz.hello;

public class var_18 {
	public static void main(String[] args) {
		int intKor=88;
		int intEng=77;
		int intmath=68;
		
		int intSum=intKor+intEng+intMath;
		
		//평균을 실수형 변수로 선언하여
		//소수점 이하 점수를 표현하고 한다
		//그런데 소수점 이하 값이 표현되기는 하지만
		//실제 정확한 계산이 되지 않는다
		//따라서 실수형으로 표현하기 위해서는 계산란에
		//점수를 실수형으로 강제 변환해 주어야 한다.
		float fAvg=(float)(intSum/3);
		
		System.out.println("총점"+intSum);
		System.out.println("평균"+fAvg);
		
		
	}

}
