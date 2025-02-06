package ch05_conditional;

import java.util.Scanner;

public class conditionalEx {
	public static void main(String[] args) {
		/* 사용자로부터 숫자를 입력 받아 짝수인지 홀수인지 판별하시오.
		 * 조건1:정수만 입력받음
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요(정수)");
		System.out.print(">>>");
		//if문을 사용하여 짝수면 "짝수", 홀수면 "홀수"를 출력하시오.
		// 1.입력받음(형변환 int로)
		String count = scan.nextLine();
		int A = Integer.parseInt(count);
		// 2. 조건식 if, 연산자 operator 사용
		if(A % 2 == 0) {
			System.out.printf("%d는 %s입니다.",A,"짝수");
		} else {
			System.out.printf("%d는 %s입니다.",A,"홀수");
		}
	}
} 