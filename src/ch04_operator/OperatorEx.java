package ch04_operator;

import java.util.Scanner;

/**
 * class Name   : OperatorEx
 * Author       : MiJeong
 * Created Date : 2025. 1. 23.
 * Version      : 1.0
 * Purpose      : java 기초
 * Description  : 연산자 연습문제
 */
public class OperatorEx {
	public static void main(String[] args) {
		//사용자에게 이메일 주소를 입력받으세요
		//email 형식이 아니면 "이메일 형식이 아닙니다!"
		//email 형식이면 "사용가능"을 출력(기준 : @ 포함여부)
		Scanner scan = new Scanner(System.in);
		System.out.println("email 주소를 입력하세요.");
		System.out.print(">>>");
		//1.입력받기
		String address = scan.nextLine();
		//2.email 형식 체크(ex:문자열 함수에서 특정 문자열 인덱스를 가져온다.)
		//   ==  <--같으면 true 리턴
		String message = (address.indexOf("@") == -1)?"이메일 형식이 아닙니다.":"사용가능합니다.";
		//3.메시지 출력
		System.out.printf("고객님의 입력: %s 은 %s",address,message);
	}
	
}
