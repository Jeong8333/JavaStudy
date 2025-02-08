package practice;

import java.awt.FocusTraversalPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Result03 {
	public static void main(String[] args) {
	
		/*
		 * Q.01
		 * 로또번호 생성 메서드 1~45까지 랜덤 숫자 6개를 오름차순으로 출력하는 makeLotto() 만들어 주세요
		 * (로또 번호는 중복이 없습니다.)
		 * 
		 * */
	
		System.out.println("===== 행운의 로또번호 생성기 =====");
		Set<Integer> lotto2 = makeLotto();
		ArrayList<Integer> weekLotto = new ArrayList<>(lotto2);
		Collections.sort(weekLotto);
		System.out.println(weekLotto.toString());
		System.out.println("===== 행운이 가득하시길~!~! =====");
		
		
		
		/*
		 * Q.02
		 * 위의 로또번호 생성 메서드를 오버로딩하여 사용자의 희망 번호 최대 6개를 매개변수로 전달받아
		 * 나머지 숫자를 1~45까지로 생성 후 오름차순으로 출력하는 makeLotto(String [] strArr) 만들어주세요.
		 * (로또 번호는 중복이 없습니다.)
		 * 참고사항 : 사용자의 매개변수 전달 값에도 중복은 없습니다.
		 * 
		 * */
		
		System.out.println("===== 행운의 로또번호 생성기 =====");
		System.out.println("희망하는 번호를 입력해주세요");
		System.out.println(">>>>>");
		Scanner scan = new Scanner(System.in);
		String nums = scan.nextLine();
		nums.split(" ");
		String[] arr = new String[nums.length()];
		Set<Integer> lotto3 = makeLotto(arr);
		ArrayList<Integer> weekLotto2 = new ArrayList<>(lotto3);
		Collections.sort(weekLotto2);
		System.out.println(weekLotto2.toString());
		System.out.println("===== 행운이 가득하시길~!~! =====");
		
		

		
}
	
	
	public static Set<Integer> makeLotto() {
		Set<Integer> lotto = new HashSet<>();
		//1 ~ 45 사이의 랜덤값 6개 생성
		while(lotto.size()<6){
			int num = (int)((Math.random()*45)+1);
			lotto.add(num);
		}
		return lotto;
		
	}
	
	public static Set<Integer> makeLotto(String[] strArr) {
		Set<Integer> lotto = new HashSet<>();
		int hopenum = strArr.length;
		//lotto=set(strArr);
	
		while(lotto.size()<6-hopenum){
			int num = (int)((Math.random()*45)+1);
			lotto.add(num);
		}
		return lotto;
	}
	
	

}
