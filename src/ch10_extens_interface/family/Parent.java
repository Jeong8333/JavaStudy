package ch10_extens_interface.family;

/**
 * class Name   : Parent
 * Author       : MiJeong
 * Created Date : 2025. 2. 7.
 * Version      : 1.0
 * Purpose      : java 기초
 * Description  : 상속(기본 상속방법) 
 */

public class Parent {
	private String name;
	private int age;
	
	public Parent() {
		super();
	}
	public Parent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//오버라이딩(부모의 메서드를 재정의(override)해서 사용)
	// 부모에게는 toString()이라는 동일한 메서드가 있음. 하지만 재정의해서 다르게 사용할 수 있음
	@Override
	public String toString() {
		return "Parent [name=" + name + ", age=" + age + "]";
	}
	public void SayHello() {
		System.out.println("부모입니다.");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
