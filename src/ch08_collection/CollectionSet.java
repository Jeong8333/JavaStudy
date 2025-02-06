package ch08_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * class Name   : CollectionSet
 * Author       : MiJeong
 * Created Date : 2025. 2. 4.
 * Version      : 1.0
 * Purpose      : java 기초
 * Description  : Set
 */
public class CollectionSet {
	public static void main(String[] args) {
		//Set은 중복을 허용하지 않음(순서가 유지되지 않음)
		Set<String> sets = new HashSet<>();
		sets.add("a");
		sets.add("b");
		sets.add("c");
		sets.add("a");
		System.out.println(sets);
		
		//for문
		for(String str : sets) {
			System.out.println(str);
		}
		System.out.println(makeLotto());
		Set<Integer> myLotto = makeLotto();
		// set to list
		ArrayList<Integer> lotto = new ArrayList<>(myLotto);
		System.out.println(lotto);
		Collections.sort(lotto);
		System.out.println(lotto);
		
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

}
