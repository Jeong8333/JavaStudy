package practice.result05;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[10];
	private static int count = 0;  // 계좌 수
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
		System.out.println("---------------------------------------");
		System.out.println("1.계좌생성 |2.계좌목록 |3.예금 |4.출금 |5.종료");
		System.out.println("---------------------------------------");
		System.out.print("선택>>");
		String choice = scanner.nextLine();
		System.out.println("---------");
		
			switch (choice) {
			case "1": {
				accountCreation(scanner);
				break;
			}
			case "2": {
				accountList();
				break;
			}
			case "3": {
				deposit(scanner);
				break;
			}
			case "4": {
				withdrow(scanner);
				break;
			}
			case "5": {
				System.out.println("프로그램 종료");
				return;
			}

			default:
				
			}
		}
	}
	private static void accountCreation(Scanner scanner) {
		System.out.println("계좌생성");
		System.out.println("---------");
		System.out.print("계좌번호: ");
		String accNum = scanner.nextLine();
		System.out.println("계좌주: ");
		String name = scanner.nextLine();
		System.out.println("초기입금액: ");
		String moneyString = scanner.nextLine();
		int money = Integer.parseInt(moneyString);
		
		accountArray[count++] = new Account(accNum, name, money);
		System.out.println("결과: 계좌가 생성되었습니다.");
		
	}
	private static void accountList() {
		System.out.println("계좌목록");
		System.out.println("---------");
		for(int i = 0; i < count; i++) {
			System.out.println(accountArray[i]);
		}
	}
	private static void deposit(Scanner scanner) {
		System.out.println("예금");
		System.out.println("---------");
		System.out.print("계좌번호: ");
		String accNum = scanner.nextLine();
		System.out.print("입금액: ");
		String money = scanner.nextLine();
		int dMoney =  Integer.parseInt(money);
		
		for (int i = 0; i < count; i++) {
            if (accountArray[i].getAccount().equals(accNum)) {
            	Account findAcc = accountArray[i];    
            	findAcc.setMoney(findAcc.getMoney() + dMoney);
            }
        }
	}
	private static void withdrow(Scanner scanner) {
		System.out.println("출금");
		System.out.println("---------");
		System.out.print("계좌번호: ");
		String accNum = scanner.nextLine();
		System.out.print("출금액: ");
		String money = scanner.nextLine();
		int wdMoney = Integer.parseInt(money);
		
		for (int i = 0; i < count; i++) {
            if (accountArray[i].getAccount().equals(accNum)) {
            	Account findAcc = accountArray[i];
            	findAcc.setMoney(findAcc.getMoney() - wdMoney);
            	System.out.println("결과: 출금이 성공되었습니다.");
            }
        }
	}

}
