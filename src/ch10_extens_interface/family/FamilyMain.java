package ch10_extens_interface.family;

public class FamilyMain {
	public static void main(String[] agrs) {
		Parent papa = new Parent("부모",60);
		System.out.println(papa.toString());
		papa.SayHello();
		
		Child baby = new Child();
		baby.setName("아기");  //child에 필드는 정의 하지 않았음.[상속 받아서 사용가능]
		baby.setAge(5);
		baby.SayHello();
		System.out.println(baby.toString());
	}
}
