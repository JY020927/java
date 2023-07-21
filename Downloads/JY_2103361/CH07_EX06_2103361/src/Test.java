//메서드 오버로딩
class A{
	void abc() {
		System.out.println("A");
	}
	void abc(int a) {
		System.out.println("B");
	}
	void abc(double b) {
		System.out.println("C");
	}
	void abc(int a, double b) {
		System.out.println("D");
	}	
}

class B{
	void bcd() {
		System.out.println("출력");
	}
	void bcd(int a) {
		System.out.println("출력");
	}
	void bcd(int a, int b) {
		System.out.println("출력");
	}
	void bcd(int a, int b, int c) {
		System.out.println("출력");
	}
}

class C{
	void cde(int... a) {
		System.out.println("출력");
	}
}
public class Test {
	public static void main(String[] args) {
		// 객체생성
		A a = new A();
		// 메서드 호출
		a.abc();
		a.abc(3);
		a.abc(5.8);
		a.abc(2,0.5);
		
		// 객체생성
		B b = new B();
		// 메서드 호출
		b.bcd();
		b.bcd(2);
		b.bcd(2, 3);
		b.bcd(2, 3, 4);
		
		// 객체생성
		C c = new C();
		// 메서드 호출
		c.cde();
		c.cde(2);
		c.cde(2, 3);
		c.cde(2, 3, 4);
	}

}
