package Result05;

import java.util.ArrayList;
import java.util.Scanner;

import ch09_class.quiz.Movie;

public class BankApplication {
	private ArrayList<Account> AccList = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("---------------------------------------");
		System.out.println("1.계좌생성 |2.계좌목록 |3.예금 |4.출금 |5.종료");
		System.out.println("---------------------------------------");
		System.out.print("선택>>");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		System.out.println("---------");
		while (true) {
			switch (choice) {
			case "1": {
				System.out.println("계좌생성");
				System.out.println("---------");
				break;
			}
			case "2": {
				System.out.println("계좌목록");
				System.out.println("---------");
				break;
			}
			case "3": {
				System.out.println("예금");
				System.out.println("---------");
				break;
			}
			case "4": {
				System.out.println("출금");
				System.out.println("---------");
				break;
			}
			case "5": {
				System.out.println("프로그램 종료");
				break;
			}

			default:
				
			}break;
		}
	}

}
