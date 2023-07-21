class A{
	A(){
		System.out.println("A1");
	}
	A(int a){
		System.out.println("A2");
	}
}
class B extends A{
	B(){
		System.out.println("B1");
	}
	B(int a){
		System.out.println("B2");
	}
}
public class Test {
	public static void main(String[] args) {
		A a1 = new A();
		
		A a2 = new A(3);
		
		B b1 = new B();
		
		B b2 = new B(3);
		
	}
}
