package com.biz.grade;

import java.util.Random;

public class grade_02 {
	public static void main(String[] args) {
		
		//rnd :인스턴스, 객체라고 부분다
		//변수이면서
		Random rnd=new Random();
		
		//점, dot(.)연산자를 사용하여 또 다른 기능의 명령어를 연결하고
		//명령문을 이룰수있다
		//아래의 명령문은 아무일도 수행하지 않는 것처럼 보이지만
		//실제로는 무언가 기능을 수행하게 된다
		//이명령문은 콘솔에 표시하는 기능이 없기 때문에
		//수행된 결과를 확인할수 없을 뿐이다
		//점 연산자를 사용하여 연결되는 명령문중 ()가 부착되는 명령문을
		//method라고 부룬다
		
		rnd.nextInt();//rnd 객체의 next() method 라고 부룬다 
						//random 클래스의 next() method 라고도 부룬다
		
		//명령문이 수행된 결과를 콘솔에 나타내고 싶으면
		//일단 어떤변수와 연결하여 사용을 한다
		//아래의 코드는 next() method를 실행한후 
		//결과를 num라는 변수에 보관을 한다
		int num=rnd.nextInt();
		System.out.println(num);
		
		//nextInt()는 (4칙)연산자와 혼합하여 연산을 수행할수 있는데
		//이때는 그 결과를 반드시 다른 변수에 보관해야 한다
		num=rnd.nextInt()/10;
		
		//System, out, plintln() 라는 3개의 명령어가
		//점(.) 연산자로 연결되어 하나의 명령문이 된 형태이다
		//이 명령문은 끝의 plintln() method의 괄호안에 있는
		//값, 연산결과, 변수에 담긴값 들을 console에 보여주는 명령문이다
		System.out.println(num);
		
		
		
		
	}

}
