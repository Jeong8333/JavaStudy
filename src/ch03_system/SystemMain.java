package ch03_system;

import java.util.Scanner;

/**
 * class Name   : SystemMain
 * Author       : MiJeong
 * Created Date : 2025. 1. 22.
 * Version      : 1.0
 * Purpose      : 시스템 클래스의 in, out
 * Description  : 표준 입출력 
 */

public class SystemMain {
	public static void main(String[] args) {
		System.out.print("hi");
		System.out.print(" hello");
		System.out.println();
		System.err.println("오류 표시");
		
		//이스케이프 문자 사용( 문자열 내에서 특수한 기능을 수행하기 위한 문자 )
		// \n 개행, \t 탭 \" <-- 문자열로 쌍따옴표
		System.out.println("Hello \nWorld");
		System.out.println(" \"안녕\" ");
		
		//printf 문자열 포멧 형태로 출력
		System.out.printf("원주율은 %.2f \n", 3.141592);
		System.out.printf("%d 명이 %s 듣고 있습니다",17,"java 수업");
		
		//System.in 사용자 입력
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("이름:나이를 입력하세요=");
		String userInput = scan.nextLine();  // 사용자가 입력한 내용 저장
		System.out.println(userInput);       // 저장된 내용 출력
		
	}

}
