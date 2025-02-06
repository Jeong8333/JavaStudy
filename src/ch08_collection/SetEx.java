package ch08_collection;

import java.awt.FocusTraversalPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
		
		// 행운의 로또생성기를 만들어 주세요
		//1.사용자에게 수량을 입력받아서 해당 수량만큼 로또번호를 생성해주세요.
		//input : int (수량)
		//output: ArrayList<HashSet> (로또번호)
		
		System.out.println("===== 행운의 로또번호 생성기 =====");
		Scanner scan = new Scanner(System.in);
		System.out.println("몇개 만들까요?");
		System.out.println(">>>>>");
		int cnt = Integer.parseInt(scan.nextLine());
		ArrayList<Set<Integer>> result = happyLotto(cnt);
		for(Set<Integer> sets:result) {
			ArrayList<Integer> lotto = new ArrayList<>(sets);
			Collections.sort(lotto);
			System.out.println(lotto);
		}
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

	public static ArrayList<Set<Integer>> happyLotto(int a) {
		ArrayList<Set<Integer>> lotto2 = new ArrayList<>();
		//사용자가 입력한 개수만큼의 로또 생성
		for(int i =0; i < a; i++){
			lotto2.add(makeLotto());
		}
		return lotto2;
	}
	
	
}

