interface A{
	void abc();
	default void bcd() {
		System.out.println("인터페이스 디폴트 메서드");
	}
	static void cde() {
		System.out.println("인터페이스 정적(static) 메서드");
	}
}

class B implements A{	
	public void abc() {
		System.out.println("클래스 B의 abc()");
	}
	public void bcd() {
		System.out.println("클래스 B의 bcd()");
	}
}

public class Test {
	public static void main(String[] args) {
		
		//정적메서드 사용하기
		A.cde();
		//디폴트 메서드 사용하기 (자식클래스를 생성)
		A a = new B();
		a.abc();
		a.bcd();
		
		
	}
}