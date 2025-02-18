package practice.cafe;

import java.util.ArrayList;
import java.util.Scanner;

import ch09_class.quiz.Movie;
import ch09_class.quiz.MovieDB;
import ch09_class.students.studentMain;

public class Cafe {
	private String name;   //카페명
	private ArrayList<Coffee> menuList = new ArrayList<>(); // 메뉴판
	
	public Cafe(String name) {
		this.name = name;
		this.menuList = menuList;
	}
	
	public void addCoffee(String name, int price) {
		menuList.add(new Coffee(name,price));
	}
	
	public void showMenu() {
		System.out.println("어서오세요. " + name + " 입니다.");
		for(int i = 0; i<menuList.size();i++) {
			Coffee coffee = menuList.get(i);
			System.out.println((1+i)+". ["+ coffee.getName()+":"+coffee.getPrice()+"]");
		}
		System.out.print("메뉴를 선택해주세요: ");
	}
	public void buyCoffee() {
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		int menu = Integer.parseInt(choice);
		Coffee order = menuList.get(menu - 1);
        System.out.println(order.getName() + "를 " + order.getPrice() + "원에 구매했습니다.");
		
	}
}
	
	
	

	
	
	
	
	
		
	

