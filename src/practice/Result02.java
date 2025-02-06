package practice;

public class Result02 {
	
	//	Q.2 업다운 게임
	//  1 ~ 50 사이의 랜덤 정수 생성
	//  기회는 5번! 
	public static void main(String[] args) {
	    System.out.println("== 난수 발생 == ");
	   for(int i = 0 ; i < 10; i++) {
		   System.out.println(Math.random());// 난수 생성 메소드 0 ~ 1 사이 실수
	   }
	   int randInt =  (int) (Math.random() * 50 + 1);  // 1 ~ 5 사이 정수
	   System.out.println(randInt);
	}
}
