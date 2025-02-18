package practice.cafe;

public class Coffee {
	private String name; //메뉴명
	private int price;	 //가격
	
	

	public Coffee(String name, int price) {
		this.name = name;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}

	
}
