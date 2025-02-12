package ch13_thread;

/**
 * class Name   : ExThead
 * Author       : MiJeong
 * Created Date : 2025. 2. 12.
 * Version      : 1.0
 * Purpose      : java 기초
 * Description  : 스레드 사용1.Thread 클래스를 상속 받는 방법
 */
public class ExThead extends Thread{
	int num;
	
	public ExThead(int num, String name) {
		super(name);
		this.num = num;
	}
	// 스레드.start() 메소드 호출시 실행되는 메소드
	// 스레드 사용 로직을 작성하는 부분
	@Override
	public void run() {
		for(int i = num; i<= num+5; i++) {
			System.out.println(super.getName()+ " " +i);
			//시간차를 두기 위해
			try {
				Thread.sleep(500); //0.5초 딜레이
			} catch (InterruptedException e) {
				e.printStackTrace();
			}  
		}
	}
	
	
	
}
