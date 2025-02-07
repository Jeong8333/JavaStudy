package ch10_extens_interface.papacar;

public class GasCar implements Vehicle {

	@Override
	public void start() {
		System.out.println("부릉~ 부릉~");
		

	}

	@Override
	public void stop() {
		System.out.println("..ㅌ...탈 ...탈");

	}

}
