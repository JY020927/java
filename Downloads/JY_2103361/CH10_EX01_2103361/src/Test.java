class A{}
class B extends A{}
class C extends B{}
class D extends C{}

public class Test {
	public static void main(String[] args) {
		B bc = new C();
		
		A a = (A)bc; //0
		B b = (B)bc; //0
		C c = (C)bc; //0
		D d = (D)bc; //X
	}
}
