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
			
			switch (choice) {
			case "1": {
				
			}
			case "2": {
				
			}
			case "3": {
				System.out.println("사무실로 복귀합니다..");
				return;
			}
			
			default:
				

			}
		}
	}
}
