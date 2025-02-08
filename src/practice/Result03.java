package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Result03 {
	public static void main(String[] args) {
	
		/*
		 * Q.01
		 * 로또번호 생성 메서드 1~45까지 랜덤 숫자 6개를 오름차순으로 출력하는 makeLotto() 만들어 주세요
		 * (로또 번호는 중복이 없습니다.)
		 * 
		 * */
	
		System.out.println("Q.01 \\n===== 행운의 로또번호 생성기 =====");
		Set<Integer> lotto2 = makeLotto();
		ArrayList<Integer> weekLotto = new ArrayList<>(lotto2);
		Collections.sort(weekLotto);
		System.out.println(weekLotto.toString());
		System.out.println("===== 행운이 가득하시길~!~! =====");
		
		
		
		/*
		 * Q.02
		 * 위의 로또번호 생성 메서드를 오버로딩하여 사용자의 희망 번호 최대 6개를 매개변수로 전달받아
		 * 나머지 숫자를 1~45까지로 생성 후 오름차순으로 출력하는 makeLotto(String [] strArr) 만들어주세요.
		 * (로또 번호는 중복이 없습니다.)
		 * 참고사항 : 사용자의 매개변수 전달 값에도 중복은 없습니다.
		 * 
		 * */
		
		System.out.println("Q.02 \\n===== 행운의 로또번호 생성기 =====");
		System.out.println("희망하는 번호를 입력해주세요");
		System.out.println("주의! 1~45 사이의 숫자만 입력하세요.(예: 1,5)");
		System.out.print(">>>>>");
		Scanner scan = new Scanner(System.in);
		String nums = scan.nextLine();
		String[] arr = nums.split(",");
		Set<Integer> lotto3 = makeLotto(arr);
		ArrayList<Integer> weekLotto2 = new ArrayList<>(lotto3);
		Collections.sort(weekLotto2);
		System.out.println(weekLotto2.toString());
		System.out.println("===== 행운이 가득하시길~!~! =====");
		
		
		
		/*
		 * Q.03
		 * 위의 메서드를 활용하여 로또번호 생성 콘솔 프로그램을 만들어 주세요.
		 * [상황 1]
		 * n을 입력하면 전체 자동 생성
		 * [상황 2]
		 * y를 입력하고 숫자를 띄어쓰기로 입력
		 *  
		 * */
		System.out.println("Q.03 \n===== 행운의 로또번호 생성기 =====");
		System.out.println("입력 값이 있으면 'y', 전체 자동으로 선택하려면 'n'을 선택하세요");
		System.out.print(">>>>>");
		Scanner scan_Q3 = new Scanner(System.in);
		String answer = scan_Q3.nextLine();
		if(answer == "n") {
			Set<Integer> lottoQ3n = makeLotto();
			ArrayList<Integer> weekLottoQ3n = new ArrayList<>(lottoQ3n);
			Collections.sort(weekLottoQ3n);
			System.out.println(weekLottoQ3n.toString());
				
		} else if(answer =="y") {
			System.out.println("번호를 한칸씩 띄어서 입력해주세요. 최대 6개)");
			System.out.print(">>>>>");
			Scanner scanQ3y = new Scanner(System.in);
			String numsQ3 = scanQ3y.nextLine();
			String[] arrQ3 = numsQ3.split(" ");
			Set<Integer> lottoQ3y = makeLotto(arrQ3);
			ArrayList<Integer> weekLottoQ3y = new ArrayList<>(lottoQ3y);
			Collections.sort(weekLottoQ3y);
			System.out.println(weekLottoQ3y.toString());
			System.out.println("===== 행운이 가득하시길~!~! =====");
			
		}
		
		

		
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
	
	public static Set<Integer> makeLotto(String[] strArr) {
		Set<Integer> lotto2 = new HashSet<>();
		
		for(String num : strArr) {
			int usernum = Integer.parseInt(num);
			if(usernum < 1|| usernum >45) {
				continue;
			}lotto2.add(usernum);
		}
			
		while(lotto2.size()<6){
			int num = (int)((Math.random()*45)+1);
			lotto2.add(num);
		}
		return lotto2;
	}
	
	

}