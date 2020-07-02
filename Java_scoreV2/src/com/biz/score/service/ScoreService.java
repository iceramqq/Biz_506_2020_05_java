package com.biz.score.service;

/*
 * ScoreService클래스를 디자인하기
 * 		boolean inputScore()
 * 		void calcSum()
 * 		void calcAvg()
 * 		void scoreList()
 * 
 * 
 * 인터패이스
 * 자바 클래스의 한형태이다
 * 메서드들의 원형을 정의만 할수 잇다.
 * 메서드들의 할일는 구체적ㅇ으로 작성할수 없다.
 * 모든 메서드는 없이 메서드에서 바로 문장이 종료돤다.
 * 인터페이스를 한 클래스네 규칙을 지정한다.
 * 인터패이스를 한  클래스는
 * 	인터페이스에 정의된 메서드를 모두 구련해야 한다.
 *  인터페이스에 정의된 모든 메서드를 의무적으로 포함해야 한다.
 *  인터페이스에 정의된 메서드 이름을 변경하여 사용할수 없다
 * 
 * 인터패이스를 한 클래스를 사용하는 곳에서는
 * 		지금호출하는 메서드는 어떤 클래스를
 * 
 * 인터패이스를 사용하므로 해서 클래스와 클래스간에
 * 		결합도는 낮아지고 응짖ㅂ도는 높아져서 개발생산성, 츄지보수성, 등이 매우 좋아진다
 * 
 *  인터패이스를 잘 디자인 해 두면, 어플리케이션을 만들어가는 과정중에
 *  		후반불 
 * 
 */
public interface ScoreService {
	public boolean inputScore();
	public void calcSum();
	public void calcAvg();
	public void scoreList();
}
