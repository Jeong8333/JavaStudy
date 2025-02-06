package ch06_method;

import java.util.Scanner;

public class MethodEx {

	public static void main(String[] args) {
		// 이름, 국어점수, 수학점수, 영어점수를 입력받아
		// 평균과 등급을 출력하는 메소드를 작성하시오
		
		// input : String, int, int, int
		// output : 없음
		// method name : makeCard
		// 등급은 90 이상:A, 80이상:B, 나머지 C
		// 출력) xxx님의 평균은 95.0으로 A등급 입니다.
		makeCard("팽수",100,90,100);

	}
	public static void makeCard(String name, int kor, int math, int eng) {
		
		double avg = (kor+eng+math)/3.0;
		
		String grade = "none";
		
		if(avg >= 90) {
			grade = "A";
		} else if(avg >= 80) {
			grade = "B";
		} else {
			grade ="C";
		}
		
		System.out.printf("%s님의 평균은 %.2f으로 %s등급 입니다.",name, avg, grade);		
	}

}
