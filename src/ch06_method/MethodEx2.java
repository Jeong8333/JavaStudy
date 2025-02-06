package ch06_method;

import java.util.Scanner;

public class MethodEx2 {

	public static void main(String[] args) {
		//  coffee shop method 를 만들어 주세요
		// input : 고객 수
		// output : 없음
		
		//고객 수만큼 커피 주문을 받아 금액을 출력하는 메소드
		
		//아아, 아메리카노: 3000, 카푸치노: 4500, 밀크티: 5000
		//메뉴가 없으면 '메뉴가 없습니다.' 출력 후 다시 주문받아야함.
		//n명 고객 주문완료
		//총 주문 금액 : m원
		
		order(3);

	}
	public static void order(int count){
		
		System.out.println(count+"명 고객 입장");
		Scanner scan = new Scanner(System.in);
		
			System.out.println(count+"번째 고객님 어떤걸 드릴까요?");
			int price = 0;
			
			String menu = scan.nextLine();
			switch(menu) {
				case "아아":
				case "아메리카노":
					price += 3000;
					System.out.printf("선택한 음료는 3000원 입니다. \n");
					break;
				case "카푸치노":
					price += 4500;
					System.out.printf("선택한 음료는 4500원 입니다. \n");
					break;
				case "밀크티":
					price += 5000;
					System.out.printf("선택한 음료는 5000원 입니다. \n");
					break;
			
				default : 
					System.out.printf("메뉴가 없습니다. \n");
					count--;

			}				
		
		System.out.printf("%d명의 고객 주문완료.\n총 주문 금액 : %d원",count,price);
	}
}

