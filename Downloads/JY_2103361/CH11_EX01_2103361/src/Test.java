class A{
	//1.변수앞에 final이 붙는 경우
	int a=3;
	final int b=5;
	
	//2.메서드앞에 final이 붙는 경우
	void abc() {
		System.out.println("A");
	}
	final void bcd() {
		System.out.println("B");
	}
}
class B extends A{
	void abc() {
		System.out.println("A");
	}
//	void bcd() { //final 메서드는 오버라이딩 불가
//		System.out.println("B");
//	}
}

//3.클래스앞에 final이 붙는 경우
final class C{ }
//class D extends C {} //final 클래스는 상속 불가



public class Test {
	public static void main(String[] args) {
		A a = new A();
		a.a=7;
//		a.b=9; //final 필드이기 때문에 값 변경 불가
	}
}
