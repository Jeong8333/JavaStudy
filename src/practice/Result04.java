package practice;

import java.util.Scanner;

public class Result04 {
	public static void main(String[] args) {
		int elA = 1;
		int elB = 1;
		String uF ="";
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("========== 엘리베이터 ==========\n");
			
			System.out.println("승강기 A의 현재 위치: "+elA);
			System.out.println("승강기 B의 현재 위치: "+elB);
			System.out.print("몇층에 계시나요?[종료는 q 또는 exit]: ");
			String input = scan.nextLine();
			if(input.equalsIgnoreCase("q")||input.equalsIgnoreCase("Q")
					||input.equalsIgnoreCase("exit")||input.equalsIgnoreCase("EXIT")) {
				System.out.println("프로그램을 종료합니다. ===========");
				break;
			}
			int floor = Integer.parseInt(input);
			int absA=  Math.abs(elA-floor); //사용자와 승강기A의 위치 차이
			int absB=  Math.abs(elB-floor); //사용자와 승강기B의 위치 차이
		
			if(absA < absB) { 	//승강기 A가 더 가까운 경우
				elA = floor;
				uF="A";
			}else if(absA > absB) { 	//승강기 B가 더 가까운 경우
				elB = floor;
				uF="B";
			} else {	 //두 승강기의 위치 차이가 동일한 경우
				if (elA==elB) { 	//두 승강기가 동일한 층일때
					elA = floor;
					uF="A";
				} else if (elA > elB) {		// A가 더 높은 층일때
					elA = floor;
					uF="A";
				}else {			// B가 더 높은 층일때
					elB = floor;
					uF="B";
				}
			}System.out.println("엘리베이터" + uF + "가 " + floor + "층으로 이동하였습니다.\n");
		}
	}
}
	
	
