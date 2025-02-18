package practice.cafe;

import java.util.Scanner;

public class CafeMain {
	private void mian() {
		
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("행동을 선택해주세요");
			System.out.println("1.스타벅스 방문 |2.아카 방문 |3.사무실 복귀");
			System.out.print(">>> ");
			String choice = scan.nextLine();
			if(choice != null) {
				if(choice == "3") {
					break;
				} else {
					showMenu(choice);
				}
				
			}
		}
	}
}
