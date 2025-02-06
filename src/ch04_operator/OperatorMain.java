package ch04_operator;

import java.util.Scanner;

/**
 * class Name   : OperatorMain
 * Author       : MiJeong
 * Created Date : 2025. 1. 23.
 * Version      : 1.0
 * Purpose      : java 기초
 * Description  : 기본 연산자 
 */
public class OperatorMain {
	public static void main(String[] args) {
		// 1.증감 연산자
		int num = 10;
		num++;
		num++;
		num++;
		
		// "문자열"+"문자열"=문자열
		// "문자열"+"숫자형태"=문자열
		System.out.println("++이후 " + num);
		num--;
		System.out.println("--이후 " + num);
		// 주의(연산자의 전, 후에 따라 다름)
		int a,b;
		a = num++; // 후
		b= ++num;  // 전
		System.out.printf("a : %d, b : %d \n", a, b);
		
		// 2.대입 연산자 +=, -=, *=, /=, %=
		int c = 1;
		c +=2; // c = c + 2;
		System.out.println("c :" + c);
		c *=10; // c = c * 10;
		System.out.println("c :" + c);
		
		
		// 3.산술 연산자 +, -, *, /, %
		System.out.println(10 + 5);
		System.out.println(10 % 5);
		
		// 4.비교 연산자 >, <, >=, <=, !=, ==
		int num1 = 10;
		int num2 = 20;
		System.out.println("== 비교 연산자 ==");
		System.out.printf("num1 : %d vs num2 : %d \n", num1, num2);
		//비교 연산자는 연산 후 true, false 를 리턴 (boolean 타입)
		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 != num2);
		System.out.println(num1 == num2);
		
		// 5.삼항 연산자(조건 연산자)
		// (a) ? (b) : (c) -> a의 조건식이 참이라면 b, 아니라면 c
		String msg = (a > 9) ? "a가 9보다 큼" : "9보다 작음";
		System.out.println(msg);
		System.out.println("아이디를 입력해주세요(4자리 이상):");
		System.out.print(">>>");
		Scanner scan = new Scanner(System.in);
		// 사용자 입력을 받아서 조건이 맞으면 (사용가능합니다.)
		//                  맞지 않으면 (4자리 이상으로 다시 입력하세요.) 출력
		String userInput = scan.nextLine();
		int len = userInput.length();
		System.out.println("문자열 길이 : "+len);
		String output = len >=4 ? "사용 가능합니다." : "4자리 이상으로 다시 입력해주세요.";
		System.out.println(output);
		
		// 6.논리 연산자 &&(and 연산) : 둘 다 true 일 때 true
		//            ||(or 연산) : 둘 중 1개만 true이면 true
		
		// 아이디를 (8~14)길이만 사용 가능
		System.out.println("=== 논리 연산 ===");
		System.out.println("아이디를 입력하세요(8~14자리)");
		System.out.print(">>>");
		String userInput2 = scan.nextLine();
		int len2 = userInput2.length();
		String output2 = (len2 >= 8 && len2 <15) ? "가능" : "불가능";
		System.out.println(output2);
		
		// 성적이 90 이상 A, 80 이상 B, 나머지는 C
		System.out.println("성적을 입력하세요 : ");
		System.out.print(">>>");
		String score = scan.nextLine();
		int intScore = Integer.parseInt(score);
		String userScore = (intScore >= 90) ? "A " : (intScore >= 80 ? "B" :"C ");
		System.out.println(userScore);
		
		//결과는 A 입니다, B 입니다, C 입니다.
	}
}
