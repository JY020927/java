interface C {
	void ccc();
}
class A1{
	C c = new B();
	void abc() {
	}	
	class B implements C{		
		public void ccc() {
			System.out.println("�������̵�");
		}
	}
}
class A2{
	C c = new C() {
		public void ccc() {
			System.out.println("�������̵�");
		}
	};	
	void abc() {
	}	
}

public class Test {
	public static void main(String[] args) {
		
	}
}