package ch11_java_api;

public class ApiString {
	public static void main(String[] args) {
		String nm = "길동";
		System.out.println(nm);
		System.out.println(nm.hashCode()); 
		nm ="팽수";
		System.out.println(nm.hashCode()); //문자열이 담겨진 주소
		/* String은 불변(immutable)으로 한번 초기화 되면 그 값이 변경되지 않음.
		 * 변수에서 값 재할당시 바뀌는 건 새로운 객체를 만든 것임.
		 * 메모리 영역에서 매번 새로운String 객체를 만들면
		 * 가비지컬렉터(메모리관리)에서 할 일이 많아짐.
		 * 그래서 문자열 변경이 많다면 StringBuffer 클래스 사용
		 * */
		StringBuffer str = new StringBuffer();
		str.append("길수");
		System.out.println(str.hashCode());
		str.append("동길");
		System.out.println(str.hashCode());
		//문자열 가져오기
		String msg = str.toString();
		System.out.println(msg);
		
	}
}
