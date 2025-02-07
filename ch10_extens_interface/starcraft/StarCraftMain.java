package ch10_extens_interface.starcraft;

import java.util.ArrayList;

public class StarCraftMain {
	public static void main(String[] args) {
		Marine marine01 = new Marine();
		Marine marine02 = new Marine("영웅마린",8,100,0);
		System.out.println(marine01);
		System.out.println(marine02);
		
		marine02.move(100, 200);    //부모 기능
		marine02.stimpack();		//자식 기능
		System.out.println(marine02);
		
		/* 다양성(Polymorphism)
		 * 객체 지향 프로그래밍(OOP)의 핵심 개념 중 하나로
		 * 같은 인터페이스 or 부모 클래스를 공유하는 객체들이 서로 다른 방식으로
		 * 동작 할 수 있는 특성
		 * 오버라이팅, 오버로딩, 업캐스팅, 다운캐스팅...
		 * 장점: 코드 재사용성, 유지보수 용이, 확장성 높음
		 * */
		StarUnit highTemplar01 = new HighTemplar();
		HighTemplar highTemplar02 = new HighTemplar();
		StarUnit highTemplar03 = highTemplar02;  //자식에서 부모 객체로 형변환(자동)
		System.out.println(highTemplar01);
		System.out.println(highTemplar02);
		System.out.println(highTemplar03);
		highTemplar02.tthunderStorm();
		//타입이 부모타입이기 때문에 부모가 가지고 있지 않는 메소드 사용불가
		//highTemplar01.tthunderStorm();
		//다운캐스팅
		((HighTemplar)highTemplar01).tthunderStorm();	// 부모->자식 형변환 후 사용가능
		
		ArrayList<StarUnit> starList = new ArrayList<>();
		starList.add(marine01);
		starList.add(marine02);
		starList.add(highTemplar01);
		starList.add(highTemplar02);
		for(int i = 0; i<starList.size();i++) {
			starList.get(i).move(100, 150);
			
		}
		marine02.attack(highTemplar01);
		System.out.println(highTemplar01);
		
		StarUnit scv = new StarUnit("SCV", 5, 60, 0);
		//형변환 가능 체크(true/false)					//부모 -> 자식(불가능)
		System.err.println(scv instanceof Zealot);	//부모 객체는 자식객체로 형변활 할 수 없음
		StarUnit m = marine01;						//자식 -> 부모 -> 자식(가능)
		System.out.println(m instanceof Marine);	//부모 객체로 형변환 되었던 자식 객제는 가능
		
	}
	
	
	
}
