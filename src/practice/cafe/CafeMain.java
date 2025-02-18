package practice.cafe;

import java.util.Scanner;

public class CafeMain {
	private void mian() {
		Cafe stb = new Cafe("스타벅스");
		Cafe aka = new Cafe("아카");
		
		// 스타벅스 메뉴
		stb.addCoffee("아메리카노", 5000);
		stb.addCoffee("카푸치노", 6000);
		stb.addCoffee("오곡라떼", 7000);
		// 아카카페 메뉴
		stb.addCoffee("아메리카노", 2500);
		stb.addCoffee("바닐라라떼", 3000);
		stb.addCoffee("아이스티", 3500);
		
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("행동을 선택해주세요");
			System.out.println("1.스타벅스 방문 |2.아카 방문 |3.사무실 복귀");
			System.out.print(">>> ");
			String choice = scan.nextLine();
			if(choice.equals("3")) {
				System.out.println("사무실로 복귀합니다...");
				break;
			}else if(choice.equals("1")){
				stb.buyCoffee();
			}else if(choice.equals("2")){
				aka.buyCoffee();
			}
		}
	}
}
