package practice.cafe;

import java.util.ArrayList;

public class Cafe {
	private String name;
	private ArrayList<Coffee> menuList = new ArrayList<>();
	
	public Cafe() {
	}
	
	public Cafe(String name) {
		this.name = name;
	}

	public Cafe(String name, ArrayList<Coffee> menuList) {
		this.name = name;
		this.menuList = menuList;
	}

	@Override
	public String toString() {
		return "Cafe [name=" + name + ", menuList=" + menuList + "]";
	}
	
	

	
	
	
	
	
	
		
	
}
