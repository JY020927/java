interface A{
	void abc();
}
class B implements A{
	@Override
	public void abc() {
		System.out.println("자식클래스 직접생성");
	}
}

class C {
	void cde(A a) {
		a.abc();
	}
}



public class Test {
	public static void main(String[] args) {
		//#미션, cde()메서드를 호출하는 문법 4가지
		
		//@방법 1.
		C c1 = new C();
		A a1 = new B();
		c1.cde(a1);
		
		//@방법 2.
		C c2 = new C();
		c2.cde(new B());
		
		//@방법 3.
		C c3 = new C();
		A a2 = new A() {
			@Override
			public void abc() {
				System.out.println("익명이너클래스 생성");
			}
		};				
		c3.cde(a2);
		
		//@방법 4.
		C c4 = new C();			
		c4.cde(new A() {
			@Override
			public void abc() {
				System.out.println("익명이너클래스 생성");
			}
		});

	}
}
