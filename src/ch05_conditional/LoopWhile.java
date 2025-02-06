package ch05_conditional;

import java.util.Scanner;

public class LoopWhile {
	public static void main(String[] args) {
		//while(조건식) 조건식이 true이면 반복(주의! 무한루프)
		int i =1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
 			System.out.println("========="); 
 			System.out.println("이름을 입력하세요.(종료q)");
 			String nm = scan.nextLine();
 			//문자열==문자열 같은지 비교 함수 equals
 			if(nm.equals("q")){
 				flag = false;
 			} else {
 				System.out.println(nm+"님 환영합니다.");
 			}
 			System.out.println("=========");
 		}
		
		while(true) {
 			System.out.println("========="); 
 			System.out.println("이름을 입력하세요.(종료q)");
 			String nm = scan.nextLine();
 			//문자열==문자열 같은지 비교 함수 equals
 			if(nm.equals("q")){
 				break;
 			} else {
 				System.out.println(nm+"님 환영합니다.");
 			}
 			System.out.println("=========");
 		}
		
		//while문으로 구구단 2~9단을 출력하시오.
		// 1. 2~9단 while문으로 작성
		// 2. 1~9수에 해당되는 while문 작성
		// ex) 변수의 scope를 잘 생각해 보기(반복되는 단 마다 수는 1로 초기화되어야함.)
		int d = 2;
		while(d<=9) {
			int k =1;
			System.out.printf("===%d단==",d);			
			while(k<=9) {
				System.out.printf("%d x %d = %d \n", d,k,d*k);
				k ++;
				}
			}
			d ++;
			scan.close();
	}
}
