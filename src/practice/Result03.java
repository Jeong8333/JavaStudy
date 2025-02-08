package practice;

import java.awt.FocusTraversalPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Result03 {
	public static void main(String[] args) {
	
		/*
		 * Q.01
		 * 로또번호 생성 메서드 1~45까지 랜덤 숫자 6개를 오름차순으로 출력하는 makeLotto() 만들어 주세요
		 * (로또 번호는 중복이 없습니다.)
		 * 
		 * */
	
		System.out.println("===== 행운의 로또번호 생성기 =====");
		//Set<Integer> lotto2 = makeLotto();
		//ArrayList<Integer> weekLotto = new ArrayList<>(lotto2);
		//Collections.sort(weekLotto);
		//System.out.println(weekLotto.toString());
		System.out.println(makeLotto());
		System.out.println("===== 행운이 가득하시길~!~! =====");
		
		
}
	
	public static Set<Integer> makeLotto() {
		Set<Integer> lotto = new TreeSet<>();
		//1 ~ 45 사이의 랜덤값 6개 생성
		while(lotto.size()<6){
			int num = (int)((Math.random()*45)+1);
			lotto.add(num);
		}
		return lotto;
	}

	

}
