package ch05_conditional;

public class ConditionalMain2 {
	public static void main(String[] args) {
		//swith문은 단순 값을 매칭하는 경우 사용
		int num = 1;
		switch(num) {
		case 0 :
			System.out.println("수강 등록");
			break;
		case 1 :
			System.out.println("기초 프로그래밍");
			break;
		case 2 :
			System.out.println("취업관련");
			break;
		case 3 :
			System.out.println("종료");
			break;
			
		}
	}
}
