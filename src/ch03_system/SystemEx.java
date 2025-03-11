package ch03_system;

import java.util.Scanner;

public class SystemEx {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* 1. 사용자의 이름:나이를 입력받아
		 * 이름 출력
		 * 나이 출력 하세요.
		 * 
		 * 2. 사용자의 이름:나이를 입력받아
		 * 변수에 각각 할당 후 
		 * 해당 변수로 사용자의 이름, 나이를 출력하시오 
		 * 
		 * 단) 이름의 길이가 달라질 수 있음.
		 * hint (:)콜론을 기준으로 앞이 이름, 뒤가 나이
		 * */
		
		
		//1
		System.out.println();
		Scanner scan1 = new Scanner(System.in);
		System.out.println("이름:나이를 입력하세요 =");
		String userInput1 = scan1.nextLine();
		int user_name1 = userInput1.indexOf(":");
		System.out.println(userInput1.substring(0,user_name1));
		System.out.println(userInput1.substring(user_name1+1));
		
		//2
		System.out.println();
		Scanner scan2 = new Scanner(System.in);
		System.out.println("이름:나이를 입력하세요 =");
		String userInput2 = scan2.nextLine();
		int user_name_2 = userInput2.indexOf(":");
		String user_name2 = userInput2.substring(0,user_name_2);
		String user_age2 = userInput2.substring(user_name_2+1);
		
		//콘솔입력은 String 타입
		//숫자형태로 사용하려면 casting 형변환 해야함.
		int userAge = Integer.parseInt(user_age2);
		System.out.println("입력한 이름은 " + user_name2 + " 나이는" + user_age2 + " 이다.");
		System.out.println("입력한 이름은 " + user_name2 + " 나이는" + userAge + " 이다.");
		
	}

}
