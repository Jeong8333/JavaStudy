package ch10_extens_interface.starcraft;

public class Zealot extends StarUnit{

	private int shideld;  //질럿은 보호막이 있음.
	
	public Zealot() {
		// Zealot(name, damage, hp, armor, shield) 호출
		// new Zealot()으로 인스턴스 생성시 디폴트 값으로 생성
		this("질럿", 16, 100, 1, 60);
	}
	public Zealot(String name, int damage, int hp, int armor, int shield) {
		super(name, damage, hp, armor);
		this.shideld = shield;
	}
	
	
	public int getShideld() {
		return shideld;
	}
	public void setShideld(int shideld) {
		this.shideld = shideld;
	}
	
	
	@Override
	public String toString() {
		return "Zealot [shideld=" + shideld + ", getName()=" + getName()
				+ ", getDamage()=" + getDamage() + ", getHp()=" + getHp()
				+ ", getArmor()=" + getArmor() + "]";
	}
	
	

	



}

