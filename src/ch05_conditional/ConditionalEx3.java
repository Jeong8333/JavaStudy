package ch05_conditional;

public class ConditionalEx3 {

	public static void main(String[] args) {
		/* 거꾸로 트리를 5층 만들어 주세요
		 * 실행 결과
		 ***** 
		 **** 
		 *** 
		 **
		 * 
		  
		 * */
		
		//1.문자열 자르기 함수사용
		String star = "*****";
		for(int i =5; i>0;i--) {
			String subStar = star.substring(0,i);
			System.out.println(subStar);
		}
		
		//2.중첩for문 
		for(int i = 5;i>=1;i--) {
			for (int j = 0;j < i;j++) {
				 System.out.print("*");
			}
			System.out.println("");
		}
	}
}
