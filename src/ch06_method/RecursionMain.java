package ch06_method;

/**
 * class Name   : RecursionMain
 * Author       : MiJeong
 * Created Date : 2025. 1. 31.
 * Version      : 1.0
 * Purpose      : java 기초
 * Description  : 재귀함수
 */
public class RecursionMain {
	public static void main(String[] args) {
		System.out.println(recFactorial(3));
		Func(10);
	}
	// factorial 재귀함수 활용
	public static long recFactorial(int num) {
		if(num == 1) {
			return 1;
		
		}return num*recFactorial(num-1);
	}
	//재귀함수는 멈추는게 중요함
	public static void Func(int num) {
		if(num == 0) { //멈추는 조건 없으면 stackoverflow 발생
			return;
		}else {
			System.out.println("hi");
			Func(num-1);
		}
	}
}
