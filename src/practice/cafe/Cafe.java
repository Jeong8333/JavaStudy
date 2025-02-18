package practice.cafe;

import java.util.ArrayList;

import ch09_class.quiz.Movie;
import ch09_class.quiz.MovieDB;
import ch09_class.students.studentMain;

public class Cafe {
	private String name;   //카페명
	private ArrayList<Coffee> menuList = new ArrayList<>(); // 메뉴판
	
	ArrayList<Coffee> menuList_stb = new ArrayList<>();
	ArrayList<Coffee> menuList_aka = new ArrayList<>();
	
	public Cafe(String name, ArrayList<Coffee> menuList) {
		this.name = name;
		this.menuList = menuList;
	}
	
	private Cafe() {
		//스타벅스 메뉴
		menuList_stb.add(new Coffee("아메리카노", 5000));
		menuList_stb.add(new Coffee("카푸치노", 6000));
		menuList_stb.add(new Coffee("오곡라떼", 7000));
		
		//아카카페 메뉴
		menuList_aka.add(new Coffee("아메리카노", 2500));
		menuList_aka.add(new Coffee("바닐라라떼", 3000));
		menuList_aka.add(new Coffee("아이스티", 3500));
		
	}
	Cafe starbucks = new Cafe("스타벅스", menuList_stb);
	Cafe akaCafe = new Cafe("아카", menuList_aka);
	
	
	public void showMenu(String choice) {
		if(choice == "1") {
			System.out.println(starbucks);
		} else if(choice == "2"){
			System.out.println(akaCafe);
		}
		
	}
	

	
 
	
}
	
	
	

	
	
	
	
	
		
	

