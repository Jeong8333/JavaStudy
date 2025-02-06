package ch05_conditional;

public class LoopFor {

	public static void main(String[] args) {
		// for문 (1.초기화 식; 2.조건식; 4증감식){
		//	 3. 실행문
		// }
		for(int i = 1; i<=10;i++) {
			System.out.println(i);
		}
		// 1~10까지의 합은?
		int sum = 0;
		for(int i = 1; i <=10; i ++) {
				sum += i;
		}
		System.out.println("1~10더하면 : "+sum);
				
		// 21~45까지 합은?
		int sum2 = 0;
		for(int i=21;i<=45;i ++) {
				sum2 += i;
		}
		System.out.println("21~45더하면 : "+sum2);
				
		// 1~40까지 중에 짝수만 더한 값은?
		// 1. 1~40 반복문 만들기
		int sum3 = 0;
		for (int i=1; i<=40; i ++) {
//		  	2. 조건식(짝수일때만 더하기)
			if (i % 2 == 0) {
			sum3 += i;
			}
		}
//			3. 출력
		System.out.println("1~40까지 중 짝수의 합은:"+ sum3);
				
//		구구단 출력
		int dan = 9;
		for(int i=1; i <= 9; i ++) {
			System.out.printf("%d x %d = %d \n", dan, i, dan*i);
		}
//		2~9단 출력
//		각 단마다 1~9까지 곱하기
//		1. 단 증가 for 문
		for(int i = 2; i<=9; i ++) {
			// 5단은 제외
			if(i==5) {
//				continue;  // continue를 만나면 아래 실행문을 건너뜀.
				break;     // 즉시 종료
			}
			System.out.println("==="+i+"단 ===");
//			2. 1~9 곱하기 for문
			for(int j = 1;j<=9;j++) {
//				3. 출력
				System.out.printf("%d x %d = %d \n", i ,j ,i*j);
			}
		}
//		1~n까지 더한 값이 100 이상이 되는 지점의 n을 구하시오.
		int sum4 = 0;
		for (int i = 1; i<9999;i++) {
			sum4 += i;
			if(sum4 >= 100) {
				System.out.println("100이상이 되는 n: "+ i);
				break;
			}
		}
//		중첩 for문에서 서브 for문 시점에 특정 시점의 반복을 중단하는 label(for문의 제어흐름)
		int sum5 = 0;
		outer :
			for(int i = 2; i<=9; i++) {
				for(int j = 1; j<=9;j++) {
					sum5 = i*j;
					System.out.printf("i: %d, j: %d, i*j= %d \n",i,j,sum5);
					if(sum5>=50) {
					  //break; //서브 for문 중단, main for은 진행됨.
						break outer; //outer 해당 for문 즉시 중단
					}

				}
			}
		// 10부터 -> 1로 감소
		for(int i =10; i>=1;i--) {
			System.out.println(i);
		}
		// 5씩 증가
		for(int i = 1; i<=100;i+=5) {
			System.out.print(i); 
			System.out.print(" "); 
		}
	}
}
