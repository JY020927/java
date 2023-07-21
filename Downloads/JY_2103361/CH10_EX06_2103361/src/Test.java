class A{
	void abc() {
		System.out.println("메모리할당+초기화 등 100줄 코드");
	}
}

class B extends A{
	void abc() {
		//System.out.println("메모리할당+초기화 등 100줄 코드");
		super.abc();
		System.out.println("추가 1줄 코드");
	}
	void bcd() {
		abc();
	}
	void cde() {
		super.abc();
	}
}
public class Test {
	public static void main(String[] args) {
		B b = new B();
		b.abc();
		
		b.bcd();
		b.cde();
	}
}
