package ch06_method;

/**
 * class Name   : MethodMain
 * Author       : MiJeong
 * Created Date : 2025. 1. 31.
 * Version      : 1.0
 * Purpose      : java 기초
 * Description  : java의 함수(클래스에 종속되어 있는 method)
 */
public class MethodMain {
	//main 메소드 public이며 static하여 어디서든 사용가능하고
	//void라 리턴이 없으며 매개변수 한 개 String [] 배열타입)
	public static void main(String[] args) {
		printSum(1,100);  //메소드 실행
		System.out.println(returnSum(1,50));
		int result =returnSum(2,4);
		System.out.println(result);
		
		print("안녕하세요");
		print(10);
		print(10.01);
		
		print(factorial(5));

	}
	// 2개의 정수를 입력 받아 리턴없이 출력하는 함수
	public static void printSum(int from, int to) {
		int sum = 0;
		for(int i = from; i <= to; i++) {
			sum += i;
		}
		System.out.printf("from:%d부터 to:%d까지 합은:%d \n",from,to,sum);
	}
	//2개의 정수를 입력 받아 리턴하는 함수
	public static int returnSum(int from, int to) {
		int sum = 0;
		for(int i = from; i <= to; i++) {
			sum += i;
		}
		return sum; //리턴 타입이 맞아야 함.
	}
	public static void print(String msg) {
		System.out.println(msg);
	}
	public static void print(int msg) {
		System.out.println(msg);
	}
	public static void print(double msg) {
		System.out.println(msg);
	}
	
	//팩토리얼 메소드를 만드시오
	//input : int
	//outout : long
	//method name : factorial
	public static long factorial(int num) {
		long result = 1;
		for(int k = num; k>=1;k--) {
			result *= k;			
		}
		return result;
	}
}
